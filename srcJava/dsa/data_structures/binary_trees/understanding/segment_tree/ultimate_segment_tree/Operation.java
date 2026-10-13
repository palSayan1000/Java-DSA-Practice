package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Defines how two values of type {@code T} are combined at each internal node
 * of a {@link SegmentTree}, along with the neutral (identity) value for that
 * combination — used when a query range only partially overlaps a node.
 *
 * @param <T> the numeric type being combined
 */
public sealed interface Operation<T extends Number>
        permits DoubleOps, LongOps, FloatOps, IntegerOps {

    /**
     * Combines two values using this operation (e.g. sum, min, max).
     *
     * @param a the first value
     * @param b the second value
     * @return the combined result
     */
    T apply(T a, T b);

    /**
     * Returns the identity/neutral value for this operation — a value that,
     * when combined with any other value, has no effect on the result
     * (e.g. {@code 0} for addition, {@code MIN_VALUE} for max, {@code 1} for
     * multiplication).
     *
     * @return the identity value
     */
    T identity(); // neutral value: 0 for add, MIN_VALUE for max, 1 for multiply
}
