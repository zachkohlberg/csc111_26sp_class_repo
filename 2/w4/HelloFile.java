import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HelloFile {
    public static void main(String[] args) {
        File file = new File("HelloWorld.txt");

        // try with resource guarantees the writer is closed
        try (PrintWriter fileWriter = new PrintWriter(file)) {
            fileWriter.println("Hello World");

            System.out.println("Wrote to HelloWorld.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("Failed to write to HelloWorld.txt.");
        }
    }
}
