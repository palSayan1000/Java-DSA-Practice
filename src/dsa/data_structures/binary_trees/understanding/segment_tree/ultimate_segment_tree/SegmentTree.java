package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SegmentTree<T extends Number> {

    private final Node<T> root; // the root node of the segment tree
    private final Operation<T> op;

    /**
     * Builds a segment tree over the given array using the supplied combining
     * operation (e.g. sum, min, max).
     *
     * @param arr the source array; must be non-empty and contain only supported
     *            numeric types
     * @param op  the operation used to combine child values into a parent value
     * @throws RuntimeException if {@code arr} is empty or contains an unsupported
     *                          numeric type (e.g. {@link BigDecimal}, {@link BigInteger},
     *                          {@code Byte}, or {@code Short})
     */
    public SegmentTree(T[] arr, Operation<T> op) throws RuntimeException {
        validate(arr); // type check to avoid BigDecimal and BigInteger
        this.op = op;
        // creates a segment tree from the elements of the given array
        root = constructTree(arr, 0, arr.length - 1);
    }

    /**
     * Creates a segment tree from a primitive {@code int[]} by boxing each
     * element into an {@link Integer}.
     *
     * @param arr the primitive int array to build the tree from
     * @param op  the operation used to combine values
     * @return a new {@code SegmentTree<Integer>} built from {@code arr}
     */
    public static SegmentTree<Integer> of(int[] arr, Operation<Integer> op) {
        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    /**
     * Creates a segment tree from a primitive {@code long[]} by boxing each
     * element into a {@link Long}.
     *
     * @param arr the primitive long array to build the tree from
     * @param op  the operation used to combine values
     * @return a new {@code SegmentTree<Long>} built from {@code arr}
     */
    public static SegmentTree<Long> of(long[] arr, Operation<Long> op) {
        Long[] boxed = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    // ---------- primitive-array factories ----------
    // Let callers pass int[]/long[]/float[]/double[] directly; boxing happens here.

    /**
     * Creates a segment tree from a primitive {@code float[]} by boxing each
     * element into a {@link Float}.
     *
     * @param arr the primitive float array to build the tree from
     * @param op  the operation used to combine values
     * @return a new {@code SegmentTree<Float>} built from {@code arr}
     */
    public static SegmentTree<Float> of(float[] arr, Operation<Float> op) {
        Float[] boxed = new Float[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    /**
     * Creates a segment tree from a primitive {@code double[]} by boxing each
     * element into a {@link Double}.
     *
     * @param arr the primitive double array to build the tree from
     * @param op  the operation used to combine values
     * @return a new {@code SegmentTree<Double>} built from {@code arr}
     */
    public static SegmentTree<Double> of(double[] arr, Operation<Double> op) {
        Double[] boxed = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        return new SegmentTree<>(boxed, op);
    }

    /**
     * Builds a string of {@code count} space characters, clamped to zero for
     * negative counts.
     *
     * @param count desired number of spaces (may be negative)
     * @return a string of {@code max(0, count)} spaces
     */
    private static String spaces(int count) {
        return " ".repeat(Math.max(0, count));
    }

    /**
     * Builds a string of {@code count} underscore characters, clamped to zero
     * for negative counts.
     *
     * @param count desired number of underscores (may be negative)
     * @return a string of {@code max(0, count)} underscores
     */
    private static String underscores(int count) {
        return "_".repeat(Math.max(0, count));
    }

    /**
     * Validates that the input array is non-empty and contains only element
     * types supported by this segment tree.
     *
     * @param arr the array to validate
     * @throws RuntimeException if the array is empty ({@link DataEmptyException})
     *                          or contains an unsupported type ({@link TypeNotSupported})
     */
    private void validate(T[] arr) throws RuntimeException {
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

    /**
     * Returns the number of elements in the original array this tree was built from.
     *
     * @return the size of the underlying range (root's interval length)
     */
    public int size() {
        return root.getEndInterval() - root.getStartInterval() + 1;
    }

    // constructs the tree

    /**
     * Returns the value stored at a single index in the original array.
     *
     * @param index the index to fetch
     * @return the value at {@code index}
     */
    public T get(int index) {
        return query(index, index);   // point query — reuses your existing range query
    }

    // query

    /**
     * Recursively builds the segment tree over {@code arr[start..end]}.
     *
     * @param arr   the source array
     * @param start inclusive start index of the range to build
     * @param end   inclusive end index of the range to build
     * @return the root {@link Node} of the built subtree
     */
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

    // query helper

    /**
     * Queries the combined value over the inclusive range {@code [queryStartIndex, queryEndIndex]}.
     *
     * @param queryStartIndex inclusive start index of the query range
     * @param queryEndIndex   inclusive end index of the query range
     * @return the result of combining all values in the range using {@code op}
     * @throws IllegalArgumentException  if {@code queryStartIndex > queryEndIndex}
     * @throws IndexOutOfBoundsException if either index is outside the tree's range
     */
    public T query(int queryStartIndex, int queryEndIndex) {
        checkRange(queryStartIndex, queryEndIndex);
        return query(root, queryStartIndex, queryEndIndex);
    }

    // update

    /**
     * Recursive helper that performs the actual range query, walking the
     * tree and combining only the nodes that intersect the query range.
     *
     * @param node            the current node being visited
     * @param queryStartIndex inclusive start index of the query range
     * @param queryEndIndex   inclusive end index of the query range
     * @return the combined value for the portion of {@code node}'s range that
     * overlaps the query range, or {@code op.identity()} if there is
     * no overlap
     */
    private T query(Node<T> node, int queryStartIndex, int queryEndIndex) {
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

    // update helper

    /**
     * Updates the value at a single index and propagates the change up the tree.
     *
     * @param index the index to update
     * @param data  the new value to store at {@code index}
     * @throws IndexOutOfBoundsException if {@code index} is outside the tree's range
     */
    public void update(int index, T data) {
        checkIndex(index);
        root.setData(update(root, index, data));
    }

    // exceptions checks

    /**
     * Recursive helper that applies a point update and recomputes ancestor
     * values along the path to the affected leaf.
     *
     * @param node  the current node being visited
     * @param index the index being updated
     * @param data  the new value to store at {@code index}
     * @return the (possibly recomputed) data for {@code node} after the update
     */
    private T update(Node<T> node, int index, T data) {
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

    /**
     * Verifies that {@code index} falls within the tree's overall range.
     *
     * @param index the index to check
     * @throws IndexOutOfBoundsException if {@code index} is out of range
     */
    private void checkIndex(int index) {
        if (index < root.getStartInterval() || index > root.getEndInterval()) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of range [" + root.getStartInterval()
                            + ", " + root.getEndInterval() + "]");
        }
    }

    /**
     * Verifies that {@code [start, end]} is a valid, in-range query interval.
     *
     * @param start inclusive start index
     * @param end   inclusive end index
     * @throws IllegalArgumentException  if {@code start > end}
     * @throws IndexOutOfBoundsException if either bound is outside the tree's range
     */
    private void checkRange(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("start (" + start + ") > end (" + end + ")");
        }
        checkIndex(start);
        checkIndex(end);
    }

    // display
    // ---------- branch-drawn view ----------

    /**
     * Returns the same output as {@link #display()} — a connected ASCII
     * diagram of the tree — for use with {@code println}, logging, etc.
     *
     * @return the ASCII diagram of this tree
     */
    @Override
    public String toString() {
        return toDiagramString();
    }

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
     *
     * @return the multi-line ASCII diagram of this tree, or {@code "(empty tree)"}
     * if the tree has no root
     */
    private String toDiagramString() {
        if (root == null) {
            return "(empty tree)";
        }
        return String.join(System.lineSeparator(), buildDiagram(root).lines);
    }

    // Math.max(0, ...) guards make these safe even at the edges of odd-width /
    // multi-digit trees, where a naive subtraction could otherwise go negative
    // and blow up String.repeat with an IllegalArgumentException.

    /**
     * Recursively renders the subtree rooted at {@code node} into a
     * {@link Diagram} — the lines of ASCII art plus the layout metadata
     * needed by the parent call to align branches correctly.
     *
     * @param node the subtree root to render
     * @return the rendered {@link Diagram} for this subtree
     */
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

    private static class Node<T> {
        final private int startInterval;
        final private int endInterval;
        private T data;
        private Node<T> left;
        private Node<T> right;

        /**
         * Creates a leaf or internal node with a known data value already computed.
         *
         * @param data          the value stored at this node (leaf value, or combined
         *                      value for an internal node)
         * @param startInterval inclusive start index of the range this node covers
         * @param endInterval   inclusive end index of the range this node covers
         */
        private Node(T data, int startInterval, int endInterval) {
            this.endInterval = endInterval;
            this.startInterval = startInterval;
            this.data = data;
        }

        /**
         * Creates an internal node with a known range but no data yet; the data is
         * expected to be set later (e.g. after both children are built).
         *
         * @param startInterval inclusive start index of the range this node covers
         * @param endInterval   inclusive end index of the range this node covers
         */
        private Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        /**
         * Returns the value currently stored at this node.
         *
         * @return the node's data
         */
        private T getData() {
            return this.data;
        }

        /**
         * Overwrites the value stored at this node.
         *
         * @param data the new value to store
         */
        private void setData(T data) {
            this.data = data;
        }

        /**
         * Returns the inclusive start index of the range this node covers.
         *
         * @return the start index
         */
        private int getStartInterval() {
            return this.startInterval;
        }

        /**
         * Returns the inclusive end index of the range this node covers.
         *
         * @return the end index
         */
        private int getEndInterval() {
            return this.endInterval;
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
    private record Diagram(java.util.List<String> lines, int width, int height, int middle) {
    }
}
