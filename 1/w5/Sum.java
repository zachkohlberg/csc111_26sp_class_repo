// when the program starts, try to open a “sum.txt” file
// if the file exists and can be read:
//     read an int from the file and then close your scanner
//     print a message stating that you loaded the previous sum, including the number from the file in your message
//     instead of starting your sum at 0, start it at the number you read from the file
// if the file doesn’t exist or can’t be read:
//     print a message stating that no previous sum was found, and that you will start at 0
// after you finish summing every number, write the sum to a file named “sum.txt” so that it can be used the next time you run this program

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // note: this program uses command line args for input, so no scanner

        // the try-catch will init sum
        int sum;

        // Part 1: loading sum.txt
        try (Scanner fs = new Scanner(new File("sum.txt"))) {
            // read file
            sum = fs.nextInt();
            System.out.println("Found sum.txt. Sum starting at " + sum + ".");

        } catch (FileNotFoundException e) {
            // can't read file
            sum = 0;
            System.out.println("Didn't find sum.txt. Sum starting at " + sum + ".");
        }

        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                sum += n;
                System.out.printf("Adding %d, sum is now %d.\n", n, sum);
            } catch (NumberFormatException e) {
                System.out.printf("Skipping \"%s\" because it's not an integer.\n", args[i]);
            }
        }

        System.out.printf("Finished! Final sum is %d.\n", sum);

        // Part 2: saving sum.txt
        try (PrintWriter pw = new PrintWriter(new File("sum.txt"))) {
            // saved sum.txt
            pw.println(sum);
            System.out.println("Sum saved to sum.txt.");
        } catch (FileNotFoundException e) {
            // couldn't save sum.txt
            System.out.println("Failed to save sum to sum.txt.");
        }
    }
}

