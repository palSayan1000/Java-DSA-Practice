package important_packages.file_handling.understanding;

import java.io.*;

public class Buffered_Reader {
    static void main() throws IOException {
        // BufferReader explanation baby
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // new BufferedReader() -> this constructor has to be of reader types that is why
        // we cannot write System.in directly here
        // so we are converting (system.in) in a character stream (because system.in is byte stream)
        // using InputStreamReader -> sounds good and this BufferRead is reading that character stream that is
        // what we want baby
        // Keyboard originally is byte
        // **  to char stream then reading char stream

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You Typed: " + br.readLine()); // instead of one character at time you could read entire lines
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // now adding file reader
        try (BufferedReader br = new BufferedReader(new FileReader("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
