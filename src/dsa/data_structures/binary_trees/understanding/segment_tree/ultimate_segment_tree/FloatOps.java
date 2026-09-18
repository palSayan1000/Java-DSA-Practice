package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Built-in {@link Operation} implementations for {@code Float} values, for use
 * with {@link SegmentTree}: addition, subtraction, product, modulus, division,
 * max, and min.
 */
public enum FloatOps implements Operation<Float> {

    /** Sums two values; identity is {@code 0F}. */
    ADD {
        public Float apply(Float a, Float b) {
            return a + b;
        }
        public Float identity() {
            return 0F;
        }
    },

    /** Subtracts {@code b} from {@code a}; identity is {@code 0F}. */
    SUBTRACT {
        public Float apply(Float a, Float b) {
            return a - b;
        }
        public Float identity() {
            return 0F;
        }
    },

    /** Multiplies two values; identity is {@code 1F}. */
    PRODUCT {
        public Float apply(Float a, Float b) {
            return a * b;
        }
        public Float identity() {
            return 1F;
        }
    },

    /** Computes {@code a % b}; identity is {@code 1F}. */
    MODULES {
        public Float apply(Float a, Float b) {
            return a % b;
        }
        public Float identity() {
            return 1F;
        }
    },

    /** Divides {@code a} by {@code b}; identity is {@code 1F}. */
    DIVIDE {
        public Float apply(Float a, Float b) {
            return a / b;
        }
        public Float identity() {
            return 1F;
        }
    },

    /** Returns the larger of two values; identity is {@code -Float.MAX_VALUE}. */
    MAX {
        public Float apply(Float a, Float b) {
            return Math.max(a, b);
        }
        public Float identity() {
            return -Float.MAX_VALUE;
        }
    },

    /** Returns the smaller of two values; identity is {@link Float#MAX_VALUE}. */
    MIN {
        public Float apply(Float a, Float b) {
            return Math.min(a, b);
        }
        public Float identity() {
            return Float.MAX_VALUE;
        }
    }
}