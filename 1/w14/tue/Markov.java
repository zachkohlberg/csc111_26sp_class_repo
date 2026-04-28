public class Markov {
    public static void main(String[] args) {
        Hash<String> hashFunction = Markov::hash;
        // the data structures we need to create for the markov algorithm:
        LinkedList<String> startTokens = new LinkedList<>();
        // NOTE: you can experiment with different sizes and hash functions
        HashTable<String, LinkedList<String>> table = new HashTable<>(hashFunction, 10_000);

        // TODO: read and process each file
        // we're getting the filenames through the args array
        for (String filename: args) {
            try {
                String fileText = Files.readString(Path.of(filename));
                processFile(...);
            } catch (IOException e) {
                // TODO: print error message
                // we don't need to exit here, we'll just ignore that file
            }
        }

        // generate text
        final int MAX_LENGTH = 100; // whatever limit you want to set on generated paragraph length
        // TODO: choose random start token
        String token = ...;
        String generatedText = "";
        for (int i = 0; i < MAX_LENGTH && token != null; i++) {
            // TODO: add current token to the string
            // TODO: look up current token's entry in the table
            // TODO: get a random next token from its list
        }
    }

    static int hash(String s) {
        // TODO: put your hash function here
    }

    // NOTE: break up the program however you want, these functions are only
    // my suggestion for a structure

    static void processFile(
            String fileText,
            HashTable<String, LinkedList<String>> table,
            LinkedList<String> startTokens) {
        // TODO: see Processing.java
        String[] sections = ???;

        // process each section
        for (String section : sections) {
            processSection(section, table, startTokens);
        }
    }

    static void processSection(
            String sectionText,
            HashTable<String, LinkedList<String>> table,
            LinkedList<String> startTokens) {
        // TODO: see Processing.java
        String[] tokens = ???;

        // TODO: add first token to startTokens
        startTokens...;

        for (int i = 1; i < tokens.length; i++) {
            // names for clarity in the following code
            String currentToken = tokens[i - 1];
            String nextToken = tokens[i];

            // TODO: if current token isn't in the hash table, add an entry
            if (table.get(currentToken) == ???) {
                // create a new list and add it to the table for currentToken
                table.set(currentToken, new LinkedList<>());
            }

            // TODO: get the list for the current token
            LinkedList<String> nextTokenList = table...;

            // TODO: add nextToken to the list
            nextTokenList...;
        }

        // another descriptive name for clarity
        String lastToken = tokens[tokens.length - 1];
        // TODO: if lastToken isn't in the hash table, add an entry for it
        // TODO: get lastToken's list from the table
        // TODO: add null to the list
        // NOTE: these steps are just like what we did in the loop
    }
}
