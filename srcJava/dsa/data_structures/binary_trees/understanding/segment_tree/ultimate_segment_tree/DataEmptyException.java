package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Thrown when a {@link SegmentTree} is constructed from an empty array —
 * there's nothing to build a tree over.
 */
public final class DataEmptyException extends RuntimeException {

    /**
     * Creates a new exception with the given detail message.
     *
     * @param message description of the empty-data condition
     */
    public DataEmptyException(String message) {
        super(message);
    }
}