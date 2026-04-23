public class Hash {
    public static void main(String[] args) {
        int arrayLen = 100;

        for (String arg : args) {
            String key = arg;
            int hash = stringHash(key) % arrayLen;
            int hashAgain = stringHash(key) % arrayLen;
            System.out.printf("key=\"%s\"; hash=%d; hash again=%d\n", key, hash, hashAgain);
        }
    }

    public static int stringHash(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        return sum;
    }
}
