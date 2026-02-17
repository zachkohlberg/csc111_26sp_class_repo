import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        // - accept zero or more command line arguments, each of which
        //   should represent a file path
        // - open each file in order and print the entire file to the terminal
        // - if a file cannot be opened, then print an error message stating
        //   the name of the file and that it wasn’t found
        // - you don’t need to do anything if there are zero args, just let
        //   the program exit without printing anything (does this require its
        //   own if statement, or can you structure the rest of the program so
        //   that it happens by default?)
        // - see the Sum.java (iterating over command line args) and the file
        //   reader we wrote during class for examples

        for (String arg : args) {
            System.out.printf("Filename: %s\n", arg);
            System.out.println("Contents:");
            printFile(arg);
        }
    }

    public static void printFile(String filename) {
        try (Scanner fs = new Scanner(new File(filename))) {
            // print the file
            while (fs.hasNextLine()) {
                System.out.println(fs.nextLine());
            }
        } catch (FileNotFoundException e) {
            // do nothing or report an error
            System.out.println("ERROR: FILE NOT FOUND");
        }
    }
}
