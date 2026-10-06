package concepts.dsa.algorithms.greedy.huffman_coding.understanding;

public class Main {
    static void main() {
        String str = "abbccda";
        HuffmanCoder huffmanCoder = new HuffmanCoder(str);

        String codedStr = huffmanCoder.encode(str);
        System.out.println(codedStr);

        String decodedStr = huffmanCoder.decode(codedStr);
        System.out.println(decodedStr);

        // Bitset can be used: like an array but with a bit at each index
    }
}
