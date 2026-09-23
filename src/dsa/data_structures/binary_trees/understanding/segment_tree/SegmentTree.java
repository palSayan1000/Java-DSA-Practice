package dsa.data_structures.binary_trees.understanding.segment_tree;

import java.util.ArrayList;
import java.util.List;

public class SegmentTree {

    Node root;

    public SegmentTree(int[] arr) {
        // create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
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

//    public void display() {
//        display(this.root);
//    }

//    private void display(Node node) {
//        String str = "";
//
//        if (node.left != null) {
//            str = str + "Interval = [" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
//        } else {
//            str += "No left child";
//        }
//
//        // for current node
//        str = str + "Interval = [" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " => ";
//
//        if (node.right != null) {
//            str = str + "Interval = [" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data + " => ";
//        } else {
//            str += "No right child";
//        }
//
//        System.out.println(str);
//
//        // call the recursion
//        if (node.left != null) {
//            display(node.left);
//        }
//        if (node.right != null) {
//            display(node.right);
//        }
//    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            // leaf node
            return new Node(arr[start], start, end);
        }

        // create new node with the index you are currently at
        Node node = new Node(start, end);
        int mid = start + (end - start) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    // query
    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) { // case 1
            // node is completely lying inside query
            return node.data;
        }  else if (node.endInterval < qsi || node.startInterval > qei) { // correct case 2
            // completely outside
            return 0;
        } else { // Overlapping -> case 3
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // update
    public void update(int index, int val) {
        root.data = update(root, index, val);
    }

    // this is ai generated
    // ---------- branch-drawn view ----------

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node, index, value);
                int rightAns = update(node, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }

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

    private Diagram buildDiagram(Node node) {
        String label = String.valueOf(node.data);
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

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int data, int startInterval, int endInterval) {
            this.endInterval = endInterval;
            this.startInterval = startInterval;
            this.data = data;
        }

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
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
}
