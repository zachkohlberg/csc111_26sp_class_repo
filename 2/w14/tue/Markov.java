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

        // generate new text

        // to prevent excessively long text, we can cut it off after it exceeds some
        // max length (set this to whatever value you want)
        final int MAX_LENGTH = 100;

        // TODO: choose a random start token
        String token = startTokens.get(...);
        String generatedText = "";
        // loop until we reach the max length or a null next token
        for (int i = 0; i < MAX_LENGTH && token != null; i++) {
            // TODO: add token to the generated text
            generatedText = ...;
            // TODO: get the list of next tokens for token
            LinkedList<String> nextTokenList = table...;
            // TODO: get a new random token from the list
            token = ...;
        }
        System.out.println(generatedText);
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

        // TODO: add first token to the start list
        startTokens...;

        for (int i = 1; i < tokens.length; i++) {
            // descriptive variable names to make the rest of our code clearer
            String currentToken = tokens[i - 1];
            String nextToken = tokens[i];

            // TODO: if currentToken isn't in the table, make a new entry
            if (table.get(currentToken) == ???) {
                // currentToken isn't in the table, so add it with an empty list
                table.set(currentToken, new LinkedList<>());
            }
            // TODO: get the list for currentToken from the table
            LinkedList<String> nextTokenList = table.get...;

            // TODO: add nextToken to the list
            nextTokenList...;
        }

        // descriptive variable name to make the following code clearer
        String lastToken = tokens[tokens.length - 1];

        // TODO: if lastToken isn't in the table, make a new entry
        // TODO: get the list for lastToken
        // TODO: add null to the list
        // this is just like what we did in the loop above
    }
}
