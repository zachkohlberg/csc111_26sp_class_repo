import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile1 {
    public static void main(String[] args) {
        File file = new File("PrintFile.java");

        // we need to handle the exception below, try compiling this to see the error
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
