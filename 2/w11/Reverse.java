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

        // good first step: iterate over the characters and just print them
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }

        // iterate over the characters in s
        for (int i = 0; i < s.length(); i++) {
            // get a character from s
            char c = s.charAt(i);
            // push the character onto the stack
            stack.push(c);
        }

        String r = "";

        // just printing the contents of the stack as we remove everything
        // while (!stack.isEmpty()) {
        //     // get a char from the stack
        //     char c = stack.pop();
        //     System.out.println(c);
        // }

        // repeat until stack is empty
        while (!stack.isEmpty()) {
            // get a char from the stack
            char c = stack.pop();
            // add the char to our string
            r += c;
        }

        return r;
    }
}
