package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SegmentTree <T extends Number> {

    private static class Node<T> {
        private T data;
        final private int startInterval;
        final private int endInterval;
        private Node<T> left;
        private Node<T> right;

        private Node (T data, int startInterval, int endInterval) {
            this.endInterval = endInterval;
            this.startInterval = startInterval;
            this.data = data;
        }

        private Node (int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        private T getData() {
            return this.data;
        }

        private void setData(T data) {
            this.data = data;
        }

        private int getStartInterval() {
            return this.startInterval;
        }

        private int getEndInterval() {
            return this.endInterval;
        }
    }

    private final Node<T> root;
    private final Operation<T> op;

    public SegmentTree (T[] arr, Operation<T> op) throws RuntimeException{
        validate(arr); // type check to avoid BigDecimal and BigInteger
        this.op = op;
        // creates a segment tree from the elements of the given array
        root = constructTree(arr, 0, arr.length - 1);
    }

    private void validate(T[] arr) throws RuntimeException{
        // this validates all the elements of the array
        if (arr.length == 0) {
            throw new DataEmptyException("The given set of data is empty!!!!");
        }
        for (T i : arr) {
            if (i instanceof BigDecimal || i instanceof BigInteger || i instanceof Byte || i instanceof Short) {
                throw new TypeNotSupported("Unsupported numeric type!!!");
            }
        }
    }

        // ---------- primitive-array factories ----------
    // Let callers pass int[]/long[]/float[]/double[] directly; boxing happens here.
    public static SegmentTree<Integer> of(int[] arr, Operation<Integer> op) {
        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    public static SegmentTree<Long> of(long[] arr, Operation<Long> op) {
        Long[] boxed = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    public static SegmentTree<Float> of(float[] arr, Operation<Float> op) {
        Float[] boxed = new Float[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    public static SegmentTree<Double> of(double[] arr, Operation<Double> op) {
        Double[] boxed = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    public int size() {
        return root.getEndInterval() - root.getStartInterval() + 1;
    }

    public T get(int index) {
        return query(index, index);   // point query — reuses your existing range query
    }

    // constructs the tree
    private Node<T> constructTree(T[] arr, int start, int end) {
        if (start == end) {
            // leaf node
            return new Node<>(arr[start], start, end);
        }
        // create new node with the index you are currently at
        int mid = start + (end - start) / 2;
        Node<T> node = new Node<>(start, end);
        // setting left right
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);
        // setting data
        node.data = op.apply(node.left.getData(), node.right.getData());
        return node;
    }

    // query
    public T query (int queryStartIndex, int queryEndIndex) {
        checkRange(queryStartIndex, queryEndIndex);
        return query(root, queryStartIndex, queryEndIndex);
    }

    // query helper
    private T query (Node<T> node, int queryStartIndex, int queryEndIndex) {
        if (node.getStartInterval() >= queryStartIndex && node.getEndInterval() <= queryEndIndex) {
            // node is lying completely inside query
            return node.getData();
        }
        if (node.getStartInterval() > queryEndIndex || node.getEndInterval() < queryStartIndex) {
            // completely outside
            return op.identity();
        }
        return op.apply(query(node.left, queryStartIndex, queryEndIndex)
                , query(node.right, queryStartIndex, queryEndIndex));
    }

    // update
    public void update (int index, T data) {
        checkIndex(index);
        root.setData(update(root, index, data));
    }

    // update helper
    private T update (Node<T> node, int index, T data) {
        if (node.getStartInterval() == index && node.getEndInterval() == index) {
            // when leaf node
            node.setData(data);
            return node.getData();
        }
        if (node.getStartInterval() <= index && node.getEndInterval() >= index) {
            // when index lies between here
            node.setData(op.apply(update(node.left, index, data), update(node.right, index, data)));
            return node.getData();
        }
        return node.getData(); // when index is outside node range (intervals)
    }

    // exceptions checks
    private void checkIndex(int index) {
        if (index < root.getStartInterval() || index > root.getEndInterval()) {
            throw new IndexOutOfBoundsException(
                "Index " + index + " out of range [" + root.getStartInterval()
                + ", " + root.getEndInterval() + "]");
        }
    }

    private void checkRange(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("start (" + start + ") > end (" + end + ")");
        }
        checkIndex(start);
        checkIndex(end);
    }

    @Override
    public String toString() {
        return toDiagramString();
    }

    // display
    // ---------- branch-drawn view ----------
    /**
     * Prints the segment tree as a connected ASCII diagram, e.g.:
     * <pre>
     *      ____21____
     *     /          \
     *    7            14
     *   / \          /  \
     *  3   4        6    8
     * </pre>
     * Each leaf shows its stored value; internal nodes show the combined
     * value produced by {@code op}.
     */
    public void display() {
        System.out.println(toDiagramString());
    }

    /**
     * Same as {@link #display()} but returns the diagram as a String instead
     * of printing it, so it can be unit-tested, logged, or written to a file.
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
    private record Diagram(java.util.List<String> lines, int width, int height, int middle) {
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

    private Diagram buildDiagram(Node<T> node) {
        String label = String.valueOf(node.getData());
        int labelWidth = label.length();

        // leaf: just the label itself
        if (node.left == null && node.right == null) {
            return new Diagram(new java.util.ArrayList<>(java.util.List.of(label)), labelWidth, 1, labelWidth / 2);
        }

        // segment tree nodes are always both-children (constructTree never
        // produces a single-child internal node), so only that case is needed
        assert node.left != null;
        Diagram left = buildDiagram(node.left);
        Diagram right = buildDiagram(node.right);

        var count = left.width() - left.middle() - 1;
        String branchLine = spaces(left.middle() + 1)
                + underscores(count)
                + label
                + underscores(right.middle())
                + spaces(right.width() - right.middle());
        String connectorLine = spaces(left.middle()) + "/"
                + spaces(count + labelWidth + right.middle()) + "\\"
                + spaces(right.width() - right.middle() - 1);

        java.util.List<String> leftLines = new java.util.ArrayList<>(left.lines());
        java.util.List<String> rightLines = new java.util.ArrayList<>(right.lines());

        // pad the shallower subtree with blank rows so both sides line up row-by-row
        while (leftLines.size() < rightLines.size()) leftLines.add(spaces(left.width()));
        while (rightLines.size() < leftLines.size()) rightLines.add(spaces(right.width()));

        java.util.List<String> lines = new java.util.ArrayList<>(java.util.List.of(branchLine, connectorLine));
        for (int i = 0; i < leftLines.size(); i++) {
            lines.add(leftLines.get(i) + spaces(labelWidth) + rightLines.get(i));
        }

        return new Diagram(lines,
                left.width() + labelWidth + right.width(),
                Math.max(left.height(), right.height()) + 2,
                left.width() + labelWidth / 2);
    }
}
