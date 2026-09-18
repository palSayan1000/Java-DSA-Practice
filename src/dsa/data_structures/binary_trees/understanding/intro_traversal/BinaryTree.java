package dsa.data_structures.binary_trees.understanding.intro_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
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

    // ---------- building the tree interactively ----------
    // insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of : " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of : " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of : " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    // Traversal-->
    public void preOder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + "\t");
        inOrder(node.right);
    }

    public void postOder() {
        postOrder(root);
    }

    // ---------- branch-drawn view ----------

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + "\t");
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
    public void prettiestdisplay() {
        System.out.println(toDiagramString());
    }

    /**
     * Same as {@link #display()} but returns the diagram as a String instead of
     * printing it, so it can be unit-tested, logged, or written to a file.
     */
    private String toDiagramString() {
        if (root == null) {
            return "(empty tree)";
        }
        return String.join(System.lineSeparator(), buildDiagram(root).lines);
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

    private static class Node {
        @SuppressWarnings("FieldMayBeFinal")
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * One rendered "block" for a subtree: its lines, plus the geometry the parent
     * needs (width/height/middle) to attach its own branch lines correctly.
     */
    private static final class Diagram {
        final List<String> lines;
        final int width;   // total character width of the block
        final int height;  // number of lines in the block
        final int middle;  // horizontal offset of this node's own connector point

        Diagram(List<String> lines, int width, int height, int middle) {
            this.lines = lines;
            this.width = width;
            this.height = height;
            this.middle = middle;
        }
    }
}
