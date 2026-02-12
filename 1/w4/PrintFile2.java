import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile2 {
    public static void main(String[] args) {
        File file = new File("PrintFile.java");

        try {
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find PrintFile.java. Make sure you're in the same directory as this program.");
        }
    }
}
