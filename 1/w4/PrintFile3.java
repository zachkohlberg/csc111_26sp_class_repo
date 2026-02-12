import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile3 {
    public static void main(String[] args) {
        File file = new File("PrintFile.java");

        // the nicer "try with resource" version of a try-catch
        // - guarantees that fileScanner will be closed when we leave the try block
        // - removes the need to close the scanner ourselves
        // - prevents mistakes that might lead to the scanner not closing (we forgot
        //   to call close or it's possible to exit the try before reaching close)
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find PrintFile.java. Make sure you're in the same directory as this program.");
        }
    }
}
