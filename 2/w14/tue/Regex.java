import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Regex {
    public static void main(String[] args) {
        String text;
        try {
            text = Files.readString(Path.of("sample.txt"));
        } catch (IOException e) {
            // exit main method in a way the compiler understands
            return;
        }

        // this regex matches two line breaks with any amount of
        // additional whitespace before, after, or between the line
        // breaks, which is how we'll be separating paragraphs
        String[] paragraphs = text.split("\\s*\n\\s*\n\\s*");

        for (int i = 0; i < paragraphs.length; i++) {
            String[] tokens = paragraphs[i].split("\\s+");

            System.out.println("Paragraph " + (i + 1) + " (" + tokens.length + " tokens):\n");
            System.out.println(paragraphs[i]);
            System.out.println();
        }
    }
}
