public class Hash {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.printf(
                "str=\"%s\", hash=%d, hash again=%d\n",
                arg,
                hashString(arg, 100),
                hashString(arg, 100));
        }
    }

    public static int hashString(String str, int len) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        return sum % len;
    }
}

