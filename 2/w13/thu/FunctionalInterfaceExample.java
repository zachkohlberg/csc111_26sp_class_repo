public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // convert program args to doubles
        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.parseDouble(args[i]);
        }

        System.out.println("sum = " + sum(numbers));
        System.out.println("product = " + product(numbers));
        System.out.println("quotient = " + quotient(numbers));

        // we can pass lambda expressions like (a, b) -> a + b as arguments for
        // functional interface parameters
        System.out.println("sum = " + combine(numbers, (a, b) -> a + b));
        System.out.println("product = " + combine(numbers, (a, b) -> a * b));
        // we can pass existing methods as arguments for functional interface
        // parameters
        System.out.println("quotient = " + combine(numbers, FunctionalInterfaceExample::divide));
        System.out.println("difference = " + combine(numbers, FunctionalInterfaceExample::subtract));
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    // the annotation is optional, but it lets the compiler warn us about
    // mistakes in writing the functional interface
    @FunctionalInterface
    static interface Op {
        double operate(double a, double b);
    }

    static double combine(double[] numbers, Op op) {
        double combined = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            combined = op.operate(combined, numbers[i]);
        }
        return combined;
    }

    static double sum(double[] numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    static double product(double[] numbers) {
        double product = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            product = product * numbers[i];
        }
        return product;
    }

    static double quotient(double[] numbers) {
        double quotient = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            quotient = quotient / numbers[i];
        }
        return quotient;
    }
}
