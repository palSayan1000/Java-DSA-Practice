package important_packages.file_handling.understanding;

import java.io.*;

public class Output_Stream {
    static void main() {
        // output
        OutputStream os = System.out;
        // os.write(💖); // range is exceeded

        System.out.println();

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "Hello World".toCharArray();
            osw.write(arr);
            osw.write("\uD83D\uDC96");
            osw.write("😎👌🔥");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/note.txt", true)) {
            fw.write("Hello World!!"); // just overrides the stuff written in the file
            // if you want to append it write (, true) along with the file path (constructor overloading)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/note.txt"))) {
            bw.write("Hare Krishna!!!"); // just overrides the stuff written in the file
            // if you want to append it write (, true) along with the file path (constructor overloading)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
