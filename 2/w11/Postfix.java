import java.util.EmptyStackException;

public class Postfix {
    public static void main(String[] args) {
        // stack to hold operands
        ArrayStack<Double> stack = new ArrayStack<>();

        // could catch NumberFormat and EmptyStack exceptions and report user-friendly errors
        try {
            for (String arg: args) {
                switch (arg) {
                    case "+" -> {
                        // get two numbers from the stack
                        double b = stack.pop();
                        double a = stack.pop();
                        // apply + operator
                        double sum = a + b;
                        // push result onto stack
                        stack.push(sum);
                    }
                    case "-" -> {
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a - b);
                    }
                    // TODO: add other operators
                    // *, /, modulo, exponent, whatever else you want

                    // less obvious operators: min, max
                    // even shorter, use pops directly in expression without intermediate variables
                    case "min" -> stack.push(Math.min(stack.pop(), stack.pop()));
                    case "max" -> stack.push(Math.max(stack.pop(), stack.pop()));
                    default -> {
                        // assume everything else is a number
                        double n = Double.parseDouble(arg);
                        stack.push(n);
                    }
                }
            }

            // error check: report error if stack size != 1
            if (stack.size() != 1) {
                System.err.println("ERROR: too many operands");
            } else {
                System.out.println(stack.peek());
            }
        } catch (NumberFormatException e) {
            System.err.println("ERROR: invalid token");
        } catch (EmptyStackException e) {
            System.err.println("ERROR: too many operators");
        }

        //
        // with the addition of min and max operators:
        //
        // 8 2 3 4 - + 5 6 - max min
        // 8 2 -1 + 5 6 - max min
        // 8 1 5 6 - max min
        // 8 1 -1 max min
        // 8 1 min
        // 1
        //

    }
}
