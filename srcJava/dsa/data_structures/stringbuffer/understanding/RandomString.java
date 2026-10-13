package dsa.data_structures.stringbuffer.understanding;

import java.util.Random;

public class RandomString {

    static String generate(int size) {
        StringBuffer sb = new StringBuffer();

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int) (26 * rand.nextFloat());
            sb.append((char) randomChar);
        }

        return sb.toString();
    }

    static void generator(int size) {
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();

        Runnable task = () -> {
            synchronized (sb) {
                for (int i = 0; i < size; i++)
                    sb.append(getRandomChar(rand));
                System.out.println(sb);
                sb.setLength(0);
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform().start(task);
        }
    }

    private static char getRandomChar(Random rand) {
        return (char) (rand.nextInt(26) + (rand.nextBoolean() ? 97 : 65));
    }

    static void main() {
        generator(5);
    }
}
