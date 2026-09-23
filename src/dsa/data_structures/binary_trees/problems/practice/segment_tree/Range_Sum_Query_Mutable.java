package dsa.data_structures.binary_trees.problems.practice.segment_tree;

public class Range_Sum_Query_Mutable {
    static void main() {
        NumArray obj = new NumArray(new int[]{1, 2, 3, 4, 5, 6});
        obj.update(0, 10);
        System.out.println(obj.sumRange(0, 3));
    }
}

class NumArray {

    TreeNode root;

    public NumArray(int[] nums) {
        root = constructTree(nums, 0, nums.length - 1);
    }

    public void update(int index, int val) {
        root.data = update(root, index, val);
    }

    public int sumRange(int left, int right) {
        return sumRange(root, left, right);
    }

    private TreeNode constructTree(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start], start, end);
        }
        int mid = start + (end - start) / 2;
        TreeNode leftTree = constructTree(nums, start, mid);
        TreeNode rightTree = constructTree(nums, mid + 1, end);

        TreeNode currentNode = new TreeNode(leftTree.getData() + rightTree.getData(), start, end);
        currentNode.left = leftTree;
        currentNode.right = rightTree;

        return currentNode;
    }

    private int update(TreeNode node, int index, int val) {
        if (node.getStartInterval() == index && node.getEndInterval() == index) {
            return node.setData(val);
        }
        if (node.getStartInterval() <= index && node.getEndInterval() >= index) {
            return node.setData(update(node.left, index, val) + update(node.right, index, val));
        }
        return node.getData();
    }

    private int sumRange(TreeNode node, int left, int right) {
        if (node.startInterval >= left && node.endInterval <= right) { // case 1
            // node is completely lying inside query
            return node.data;
        } else if (node.endInterval < left || node.startInterval > right) { // case 2
            // completely outside
            return 0;
        } else { // Overlapping -> case 3
            return this.sumRange(node.left, left, right) + this.sumRange(node.right, left, right);
        }
    }

    private static class TreeNode {
        final private int startInterval;
        final private int endInterval;
        private int data;
        private TreeNode left;
        private TreeNode right;

        /**
         * Creates a leaf or internal node with a known data value already computed.
         *
         * @param data          the value stored at this node (leaf value, or combined
         *                      value for an internal node)
         * @param startInterval inclusive start index of the range this node covers
         * @param endInterval   inclusive end index of the range this node covers
         */
        private TreeNode(int data, int startInterval, int endInterval) {
            this.endInterval = endInterval;
            this.startInterval = startInterval;
            this.data = data;
        }

        /**
         * Creates an internal node with a known range but no data yet; the data is
         * expected to be set later (e.g. after both children are built).
         *
         * @param startInterval inclusive start index of the range this node covers
         * @param endInterval   inclusive end index of the range this node covers
         */
        private TreeNode(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        /**
         * Returns the value currently stored at this node.
         *
         * @return the node's data
         */
        private int getData() {
            return this.data;
        }

        /**
         * Overwrites the value stored at this node.
         *
         * @param data the new value to store
         */
        private int setData(int data) {
            return this.data = data;
        }

        /**
         * Returns the inclusive start index of the range this node covers.
         *
         * @return the start index
         */
        private int getStartInterval() {
            return this.startInterval;
        }

        /**
         * Returns the inclusive end index of the range this node covers.
         *
         * @return the end index
         */
        private int getEndInterval() {
            return this.endInterval;
        }
    }
}