package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Built-in {@link Operation} implementations for {@code Long} values, for use
 * with {@link SegmentTree}: addition, subtraction, product, modulus, division,
 * max, and min.
 */
public enum LongOps implements Operation<Long> {

    /**
     * Sums two values; identity is {@code 0L}.
     */
    ADD {
        public Long apply(Long a, Long b) {
            return a + b;
        }

        public Long identity() {
            return 0L;
        }
    },

    /**
     * Subtracts {@code b} from {@code a}; identity is {@code 0L}.
     */
    SUBTRACT {
        public Long apply(Long a, Long b) {
            return a - b;
        }

        public Long identity() {
            return 0L;
        }
    },

    /**
     * Multiplies two values; identity is {@code 1L}.
     */
    PRODUCT {
        public Long apply(Long a, Long b) {
            return a * b;
        }

        public Long identity() {
            return 1L;
        }
    },

    /**
     * Computes {@code a % b}; identity is {@code 1L}.
     */
    MODULES {
        public Long apply(Long a, Long b) {
            return a % b;
        }

        public Long identity() {
            return 1L;
        }
    },

    /**
     * Divides {@code a} by {@code b}; identity is {@code 1L}.
     */
    DIVIDE {
        public Long apply(Long a, Long b) {
            return a / b;
        }

        public Long identity() {
            return 1L;
        }
    },

    /**
     * Returns the larger of two values; identity is {@link Long#MIN_VALUE}.
     */
    MAX {
        public Long apply(Long a, Long b) {
            return Math.max(a, b);
        }

        public Long identity() {
            return Long.MIN_VALUE;
        }
    },

    /**
     * Returns the smaller of two values; identity is {@link Long#MAX_VALUE}.
     */
    MIN {
        public Long apply(Long a, Long b) {
            return Math.min(a, b);
        }

        public Long identity() {
            return Long.MAX_VALUE;
        }
    }
}