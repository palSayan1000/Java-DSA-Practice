package concepts.dsa.algorithms.range_queries.understanding;

public class Main {
    static void main() {
        Main obj = new Main();
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8},
                blocks = obj.getBlocks(arr);

        System.out.println(obj.query(blocks, arr, 2, 7));
//        System.out.println(Arrays.stream(arr).skip(2).limit(6).sum());
    }

    public int[] getBlocks(int[] arr) {
        // build a blocks array;
        int sqrt = (int) Math.sqrt(arr.length);

        int blocks_id = -1;

        int[] blocks = new int[sqrt + 1];

        for (int i = 0; i < arr.length; i++) {
            // new block is starting
            if (i % sqrt == 0) {
                blocks_id++;
            }
            blocks[blocks_id] += arr[i];
        }

        return blocks;
    }

    public int query(int[] blocks, int[] arr, int left, int right) {
        int sqrt = (int) Math.sqrt(arr.length);
        int ans = 0;

        // left part
        while (left % sqrt != 0 && left < right && left != 0) {
            ans += arr[left];
            left++;
        }

        // middle part
        while (left + sqrt <= right) {
            ans += blocks[left / sqrt];
            left += sqrt;
        }

        // right part
        while (left <= right) {
            ans += arr[left];
            left++;
        }

        return ans;
    }

    public void update(int[] blocks, int[] arr, int index, int value) {
        int sqrt = (int) Math.sqrt(arr.length);
        int block_id = index / sqrt;
        blocks[block_id] += (value - arr[index]);
        arr[index] = value;
    }
}
