public class Markov {
    public static main(String[] args) {
        // list of tokens that can begin a section of text
        LinkedList<String> startTokens = new LinkedList<>();

        // table mapping each token to a list of tokens that can follow it
        // you may want to try different sizes to see what difference they make
        Hash<String> hashFunction = Markov::hashFunction;
        HashTable<String, LinkedList<String>> table = new HashTable<>(hashFunction, 10_000);

        // build the table and start list
        for (String filename : args) {
            try {
                String fileText = Files.readString(Path.of(filename));
                processFile(fileText, table, startTokens);
            } catch (IOException e) {
                // TODO: print error message and ignore file
            }
        }
    }

    static int hashFunction(String s) {
        // TODO: write your hash function here
        // remember to try a few different hash functions to see which one is
        // fastest
    }

    // the functions below are a suggested structure, but you can organize this
    // however you want

    static void processFile(
            String fileText,
            HashTable<String, LinkedList<String>> table,
            LinkedList<String> startTokens) {

        String[] sections = fileText.split("\\s*\n\\s*\n\\s*");

        for (String section : sections) {
            processSection(section, table, startTokens);
        }
    }

    static void processSection(
            String sectionText,
            HashTable<String, LinkedList<String>> table,
            LinkedList<String> startTokens) {
        // TODO: split into tokens; see Regex.java
        String[] tokens = sectionText.split(...);

        // TODO: build hash table
    }
}
