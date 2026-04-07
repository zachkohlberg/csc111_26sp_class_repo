public class Postfix {
    public static void main(String[] args) {
        // stack to hold operands
        ArrayStack<Double> stack = new ArrayStack<>();

        // program args are input
        for (String arg : args) {
            switch (arg) {
                case "+" -> {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                }
                case "-" -> {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                }
                // TODO: add other operators
                // *, /, modulo, exponent
                default -> stack.push(Double.parseDouble(arg));
            }
        }

        System.out.println(stack.peek());
    }
}
