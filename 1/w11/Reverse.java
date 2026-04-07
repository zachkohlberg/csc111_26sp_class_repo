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

        // a good first step is to just print the elements so you can tell
        // whether the loop was coded correctly
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }

        // iterate over characters in s
        for (int i = 0; i < s.length(); i++) {
            // get a character from the string
            char c = s.charAt(i);
            // push it onto the stack
            stack.push(c);
        }

        String r = "";

        // a good first step is to just print the elements so you can tell
        // whether the loop was coded correctly
        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }

        // repeat until stack is empty
        while (!stack.isEmpty()) {
            // get a character from the stack
            char c = stack.pop();
            // add character to end of the string
            r += c;
        }

        return r;
    }
}
