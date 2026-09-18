package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public enum IntegerOps implements Operation<Integer> {
    ADD {
        public Integer apply(Integer a, Integer b) {
            return a + b;
        }
        public Integer identity() {
            return 0;
        }
    },
    SUBTRACT {
        public Integer apply(Integer a, Integer b) {
            return a - b;
        }
        public Integer identity() {
            return 0;
        }
    },
    PRODUCT {
        public Integer apply(Integer a, Integer b) {
            return a * b;
        }
        public Integer identity() {
            return 1;
        }
    },
    MODULES {
        public Integer apply(Integer a, Integer b) {
            return a % b;
        }
        public Integer identity() {
            return 1;
        }
    },
    DIVIDE {
        public Integer apply(Integer a, Integer b) {
            return a / b;
        }
        public Integer identity() {
            return 1;
        }
    },
    MAX {
        public Integer apply(Integer a, Integer b) {
            return Math.max(a, b);
        }
        public Integer identity() {
            return Integer.MIN_VALUE;
        }
    },
    MIN {
        public Integer apply(Integer a, Integer b) {
            return Math.min(a, b);
        }
        public Integer identity() {
            return Integer.MAX_VALUE;
        }
    }
}
