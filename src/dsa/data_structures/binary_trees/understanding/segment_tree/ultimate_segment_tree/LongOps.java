package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public enum LongOps implements Operation<Long>{
    ADD {
        public Long apply(Long a, Long b) {
            return a + b;
        }
        public Long identity() {
            return 0L;
        }
    },
    SUBTRACT {
        public Long apply(Long a, Long b) {
            return a - b;
        }
        public Long identity() {
            return 0L;
        }
    },
    PRODUCT {
        public Long apply(Long a, Long b) {
            return a * b;
        }
        public Long identity() {
            return 1L;
        }
    },
    MODULES {
        public Long apply(Long a, Long b) {
            return a % b;
        }
        public Long identity() {
            return 1L;
        }
    },
    DIVIDE {
        public Long apply(Long a, Long b) {
            return a / b;
        }
        public Long identity() {
            return 1L;
        }
    },
    MAX {
        public Long apply(Long a, Long b) {
            return Math.max(a, b);
        }
        public Long identity() {
            return Long.MIN_VALUE;
        }
    },
    MIN {
        public Long apply(Long a, Long b) {
            return Math.min(a, b);
        }
        public Long identity() {
            return Long.MAX_VALUE;
        }
    }
}
