package important_packages.file_handling.understanding;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    static void main() {
        // FileReader ending with writer or reading  we know It's what character stream reading just one character at a time
        try (FileReader isr = new FileReader("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/note.txt")) {
            System.out.println("Enter some letters: ");
            int letters = isr.read(); // the read actually returns an integer
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
//            isr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
