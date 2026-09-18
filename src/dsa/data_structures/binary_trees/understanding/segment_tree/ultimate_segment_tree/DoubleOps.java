package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

/**
 * Built-in {@link Operation} implementations for {@code Double} values, for use
 * with {@link SegmentTree}: addition, subtraction, product, modulus, division,
 * max, and min.
 */
public enum DoubleOps implements Operation<Double> {

    /**
     * Sums two values; identity is {@code 0D}.
     */
    ADD {
        public Double apply(Double a, Double b) {
            return a + b;
        }

        public Double identity() {
            return 0D;
        }
    },

    /**
     * Subtracts {@code b} from {@code a}; identity is {@code 0D}.
     */
    SUBTRACT {
        public Double apply(Double a, Double b) {
            return a - b;
        }

        public Double identity() {
            return 0D;
        }
    },

    /**
     * Multiplies two values; identity is {@code 1D}.
     */
    PRODUCT {
        public Double apply(Double a, Double b) {
            return a * b;
        }

        public Double identity() {
            return 1D;
        }
    },

    /**
     * Computes {@code a % b}; identity is {@code 1D}.
     */
    MODULES {
        public Double apply(Double a, Double b) {
            return a % b;
        }

        public Double identity() {
            return 1D;
        }
    },

    /**
     * Divides {@code a} by {@code b}; identity is {@code 1D}.
     */
    DIVIDE {
        public Double apply(Double a, Double b) {
            return a / b;
        }

        public Double identity() {
            return 1D;
        }
    },

    /**
     * Returns the larger of two values; identity is {@code -Double.MAX_VALUE}.
     */
    MAX {
        public Double apply(Double a, Double b) {
            return Math.max(a, b);
        }

        public Double identity() {
            return -Double.MAX_VALUE;
        }
    },

    /**
     * Returns the smaller of two values; identity is {@link Double#MAX_VALUE}.
     */
    MIN {
        public Double apply(Double a, Double b) {
            return Math.min(a, b);
        }

        public Double identity() {
            return Double.MAX_VALUE;
        }
    }
}