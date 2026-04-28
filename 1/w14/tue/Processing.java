import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Processing {
    public static void main(String[] args) {
        // read file

        String text;
        try {
            // using nio for convenience
            text = Files.readString(Path.of("sample.txt"));
        } catch (IOException e) {
            // exit main
            return;
        }


        // split into paragraphs

        // this regex matches two or more line breaks with any number of
        // whitespace characters before, after, or between them, which
        // is how we're defining our paragraph separator
        String[] paragraphs = text.split("\\s*\n\\s*\n\\s*");

        // print each paragraph
        for (int i = 0; i < paragraphs.length; i++) {
            // this regex matches any run of one or more whitespace characters,
            // which is what we've defined as our token separator
            String[] tokens = paragraphs[i].split("\\s+");

            System.out.println("# Paragraph " + (i + 1) + " (" + tokens.length + " tokens):\n");
            System.out.println(paragraphs[i]);
            System.out.println();
        }
    }
}
