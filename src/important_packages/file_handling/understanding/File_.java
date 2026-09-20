package important_packages.file_handling.understanding;

import java.io.*;

public class File_ {
    static void main() {

        // creating the file
        File fo = null;
        try {
            fo = new File("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/new-file.txt");
            boolean newFile = fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // write in the file
        try (FileWriter fw = new FileWriter(fo.getPath())) {
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज।\n" +
                    "अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुचः॥ ");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // reading from the file
        try (BufferedReader br = new BufferedReader(new FileReader(fo.getPath()))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // creating the file
        File foo = null;
        try {
            fo = new File("/home/sayanpal/Desktop/IdeaProjects/Java/src/important_packages/file_handling/understanding/randomKutta.txt");
            boolean newFile = fo.createNewFile();
            if (fo.delete()) {
                System.out.println("File was deleted baby!!!");
                System.out.println("File Name: " + fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
