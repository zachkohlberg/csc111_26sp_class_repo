public class Reverse {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(reverse(arg));
        }
    }

    // Problem: Reverse a string by pushing each char onto a stack and then
    // popping each char off the stack.
    public static String reverse(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();

        // TODO: push each char onto stack

        String r = "";
        // TODO: pop each char off stack and add to string

        return r;
    }
}
