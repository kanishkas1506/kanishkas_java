import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {

        try {
            // Try to open a file that does NOT exist
            File file = new File("E:/non_existing_file.txt");
            Scanner sc = new Scanner(file);

            // Reading file (won't execute because file doesn't exist)
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
