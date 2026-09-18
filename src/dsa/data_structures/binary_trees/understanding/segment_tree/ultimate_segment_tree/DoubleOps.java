package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public enum DoubleOps implements Operation<Double> {
    ADD {
        public Double apply(Double a, Double b) {
            return a + b;
        }
        public Double identity() {
            return 0D;
        }
    },
    SUBTRACT {
        public Double apply(Double a, Double b) {
            return a - b;
        }
        public Double identity() {
            return 0D;
        }
    },
    PRODUCT {
        public Double apply(Double a, Double b) {
            return a * b;
        }
        public Double identity() {
            return 1D;
        }
    },
    MODULES {
        public Double apply(Double a, Double b) {
            return a % b;
        }
        public Double identity() {
            return 1D;
        }
    },
    DIVIDE {
        public Double apply(Double a, Double b) {
            return a / b;
        }
        public Double identity() {
            return 1D;
        }
    },
    MAX {
        public Double apply(Double a, Double b) {
            return Math.max(a, b);
        }
        public Double identity() {
            return -Double.MAX_VALUE;
        }
    },
    MIN {
        public Double apply(Double a, Double b) {
            return Math.min(a, b);
        }
        public Double identity() {
            return Double.MAX_VALUE;
        }
    }
}
