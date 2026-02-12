import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile1 {
    public static void main(String[] args) {
        File file = new File("PrintFile1.java");

        // won't compile because this throws a checked exception
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
