package important_packages.file_handling.understanding;

import java.io.IOException;
import java.io.InputStreamReader;

public class Input_Stream_Reader {
    static void main() {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters: ");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
