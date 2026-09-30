package dsa.algorithms.greedy.huffman_coding.understanding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {
    Map<Character, String> encoder;
    Map<String, Character> decoder;

    public HuffmanCoder(String feeder) throws RuntimeException {
        Map<Character, Integer> fmap = new HashMap<>();

//        for (int i = 0; i < feeder.length(); i++) {
//            char cc = feeder.charAt(i);
//            if (fmap.containsKey(cc)) {
//                int ov = fmap.get(cc);
//                ov += 1;
//                fmap.put(cc, ov);
//            } else {
//                fmap.put(cc, 1);
//            }
//        }
        for (char ch : feeder.toCharArray()) {
            fmap.put(ch, fmap.getOrDefault(ch, 1) + 1);
        }

        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node ft /* full tree */ = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String osf /* output so far */) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf + "0");
        initEncoderDecoder(node.right, osf + "1");
    }

    public String encode(String source) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            ans.append(encoder.get(source.charAt(i)));
        }

        return ans.toString();
    }

    public String decode(String codedString) {
        String key = "";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if (decoder.containsKey(key)) {
                ans.append(decoder.get(key));
                key = "";
            }
        }

        return ans.toString();
    }

    private static class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = this.right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
