public class UnderlineWord {
    public static void main(String[] args) {
        String line = "Hello there my name is UnderlineWord.java!";
        String word = "name";

        // Print an arrow pointing to word where it appears in line
        int index = line.indexOf(word);
        System.out.println(line);
        // System.out.println(" ".repeat(index) + "^");

        // Make arrows under the entire word where it appears in line
        System.out.println(" ".repeat(index) + "^".repeat(word.length()));
    }
}
