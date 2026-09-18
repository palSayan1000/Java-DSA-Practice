package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Thrown when a {@link SegmentTree} is constructed with an array element type
 * that isn't supported (e.g. {@link java.math.BigDecimal}, {@link java.math.BigInteger},
 * {@code Byte}, or {@code Short}).
 */
public class TypeNotSupported extends RuntimeException {

    /**
     * Creates a new exception with the given detail message.
     *
     * @param message description of why the type is unsupported
     */
    public TypeNotSupported(String message) {
        super(message);
    }
}
