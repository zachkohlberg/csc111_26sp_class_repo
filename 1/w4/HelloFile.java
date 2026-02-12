import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HelloFile {
    public static void main(String[] args) {
        File file = new File("HelloWorld.txt");

        // another try with resource
        try (PrintWriter fileWriter = new PrintWriter(file)) {
            fileWriter.println("Hello World");
        } catch (FileNotFoundException e) {
            System.out.println("Failed to open HelloWorld.txt.");
        }
    }
}
