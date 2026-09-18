package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Built-in {@link Operation} implementations for {@code Integer} values, for use
 * with {@link SegmentTree}: addition, subtraction, product, modulus, division,
 * max, and min.
 */
public enum IntegerOps implements Operation<Integer> {

    /** Sums two values; identity is {@code 0}. */
    ADD {
        public Integer apply(Integer a, Integer b) {
            return a + b;
        }
        public Integer identity() {
            return 0;
        }
    },

    /** Subtracts {@code b} from {@code a}; identity is {@code 0}. */
    SUBTRACT {
        public Integer apply(Integer a, Integer b) {
            return a - b;
        }
        public Integer identity() {
            return 0;
        }
    },

    /** Multiplies two values; identity is {@code 1}. */
    PRODUCT {
        public Integer apply(Integer a, Integer b) {
            return a * b;
        }
        public Integer identity() {
            return 1;
        }
    },

    /** Computes {@code a % b}; identity is {@code 1}. */
    MODULES {
        public Integer apply(Integer a, Integer b) {
            return a % b;
        }
        public Integer identity() {
            return 1;
        }
    },

    /** Divides {@code a} by {@code b}; identity is {@code 1}. */
    DIVIDE {
        public Integer apply(Integer a, Integer b) {
            return a / b;
        }
        public Integer identity() {
            return 1;
        }
    },

    /** Returns the larger of two values; identity is {@link Integer#MIN_VALUE}. */
    MAX {
        public Integer apply(Integer a, Integer b) {
            return Math.max(a, b);
        }
        public Integer identity() {
            return Integer.MIN_VALUE;
        }
    },

    /** Returns the smaller of two values; identity is {@link Integer#MAX_VALUE}. */
    MIN {
        public Integer apply(Integer a, Integer b) {
            return Math.min(a, b);
        }
        public Integer identity() {
            return Integer.MAX_VALUE;
        }
    }
}