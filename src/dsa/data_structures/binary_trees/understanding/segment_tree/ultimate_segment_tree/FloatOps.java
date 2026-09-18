package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public enum FloatOps implements Operation<Float> {
    ADD {
        public Float apply(Float a, Float b) {
            return a + b;
        }
        public Float identity() {
            return 0F;
        }
    },
    SUBTRACT {
        public Float apply(Float a, Float b) {
            return a - b;
        }
        public Float identity() {
            return 0F;
        }
    },
    PRODUCT {
        public Float apply(Float a, Float b) {
            return a * b;
        }
        public Float identity() {
            return 1F;
        }
    },
    MODULES {
        public Float apply(Float a, Float b) {
            return a % b;
        }
        public Float identity() {
            return 1F;
        }
    },
    DIVIDE {
        public Float apply(Float a, Float b) {
            return a / b;
        }
        public Float identity() {
            return 1F;
        }
    },
    MAX {
        public Float apply(Float a, Float b) {
            return Math.max(a, b);
        }
        public Float identity() {
            return -Float.MAX_VALUE;
        }
    },
    MIN {
        public Float apply(Float a, Float b) {
            return Math.min(a, b);
        }
        public Float identity() {
            return Float.MAX_VALUE;
        }
    }
}
