package dsa.data_structures.binary_trees.understanding.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int setValue(int val) {
            return this.value = val;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int[] nums) {
        if (isSorted(nums)) {
            populateSorted(nums, 0, nums.length - 1);
        } else {
            populate(nums);
        }
    }

    private boolean isSorted(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.right) && isBalanced(node.left);
    }

    public void populate(int[] nums) {
        for (int i : nums) {
            this.insert(i);
        }
    }

    public void populateSorted(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;

        insert(nums[mid]);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

//    public void display() {
//        display(root, "Root Node: ");
//    }
//
//    private void display(Node node, String details) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(details + node.getValue());
//
//        display(node.left, "Left Child of: " + node.getValue() + " : ");
//        display(node.right, "Right Child of: " + node.getValue() + " : ");
//    }

    // this is ai generated
      // ---------- branch-drawn view ----------

    /**
     * Prints the tree as a connected ASCII diagram, e.g.:
     * <pre>
     *      __10__
     *     /      \
     *    5        15
     *   / \         \
     *  2   7        20
     * </pre>
     */
    public void display() {
        System.out.println(toDiagramString());
    }

    /**
     * Same as but returns the diagram as a String instead of
     * printing it, so it can be unit-tested, logged, or written to a file.
     */
    private String toDiagramString() {
        if (root == null) {
            return "(empty tree)";
        }
        return String.join(System.lineSeparator(), buildDiagram(root).lines);
    }

    /**
     * One rendered "block" for a subtree: its lines, plus the geometry the parent
     * needs (width/height/middle) to attach its own branch lines correctly.
     *
     * @param width  total character width of the block
     * @param height number of lines in the block
     * @param middle horizontal offset of this node's own connector point
     */
        private record Diagram(List<String> lines, int width, int height, int middle) {
    }

    // Math.max(0, ...) guards make these safe even at the edges of odd-width /
    // multi-digit trees, where a naive subtraction could otherwise go negative
    // and blow up String.repeat with an IllegalArgumentException.
    private static String spaces(int count) {
        return " ".repeat(Math.max(0, count));
    }

    private static String underscores(int count) {
        return "_".repeat(Math.max(0, count));
    }

    private Diagram buildDiagram(Node node) {
        String label = String.valueOf(node.value);
        int labelWidth = label.length();

        // leaf: just the label itself
        if (node.left == null && node.right == null) {
            return new Diagram(new ArrayList<>(List.of(label)), labelWidth, 1, labelWidth / 2);
        }

        // only a left child
        if (node.right == null) {
            Diagram left = buildDiagram(node.left);

            String branchLine = spaces(left.middle + 1)
                    + underscores(left.width - left.middle - 1)
                    + label;
            String connectorLine = spaces(left.middle) + "/"
                    + spaces(left.width - left.middle - 1 + labelWidth);

            List<String> lines = new ArrayList<>(List.of(branchLine, connectorLine));
            for (String line : left.lines) {
                lines.add(line + spaces(labelWidth));
            }
            return new Diagram(lines, left.width + labelWidth, left.height + 2,
                    left.width + labelWidth / 2);
        }

        // only a right child
        if (node.left == null) {
            Diagram right = buildDiagram(node.right);

            String branchLine = label
                    + underscores(right.middle)
                    + spaces(right.width - right.middle);
            String connectorLine = spaces(labelWidth + right.middle) + "\\"
                    + spaces(right.width - right.middle - 1);

            List<String> lines = new ArrayList<>(List.of(branchLine, connectorLine));
            for (String line : right.lines) {
                lines.add(spaces(labelWidth) + line);
            }
            return new Diagram(lines, labelWidth + right.width, right.height + 2, labelWidth / 2);
        }

        // both children
        Diagram left = buildDiagram(node.left);
        Diagram right = buildDiagram(node.right);

        String branchLine = spaces(left.middle + 1)
                + underscores(left.width - left.middle - 1)
                + label
                + underscores(right.middle)
                + spaces(right.width - right.middle);
        String connectorLine = spaces(left.middle) + "/"
                + spaces(left.width - left.middle - 1 + labelWidth + right.middle) + "\\"
                + spaces(right.width - right.middle - 1);

        List<String> leftLines = new ArrayList<>(left.lines);
        List<String> rightLines = new ArrayList<>(right.lines);

        // pad the shallower subtree with blank rows so both sides line up row-by-row
        while (leftLines.size() < rightLines.size()) leftLines.add(spaces(left.width));
        while (rightLines.size() < leftLines.size()) rightLines.add(spaces(right.width));

        List<String> lines = new ArrayList<>(List.of(branchLine, connectorLine));
        for (int i = 0; i < leftLines.size(); i++) {
            lines.add(leftLines.get(i) + spaces(labelWidth) + rightLines.get(i));
        }

        return new Diagram(lines,
                left.width + labelWidth + right.width,
                Math.max(left.height, right.height) + 2,
                left.width + labelWidth / 2);
    }
}
