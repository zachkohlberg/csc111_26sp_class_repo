public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.parseDouble(args[i]);
        }

        // you can use lambda expressions to fill functional interface parameters
        double sum = combine(numbers, (a, b) -> a + b);
        // you can also use existing methods to fill functional interface parameters
        double product = combine(numbers, FunctionalInterfaceExample::multiply);

        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
    }

    // the combine method is a version of these methods that takes the
    // operation (+, *, etc.) as a parameter using the Op functional
    // interface we declared later on in this file

    // static double sum(double[] array) {
    //     double sum = array[0];
    //     for (int i = 1; i < array.length; i++) {
    //         sum = sum + array[i];
    //     }
    //     return sum;
    // }
    //
    // static double product(double[] array) {
    //     double product = array[0];
    //     for (int i = 1; i < array.length; i++) {
    //         product = product * array[i];
    //     }
    //     return product;
    // }

    static double combine(double[] array, Op op) {
        double combined = array[0];
        for (int i = 1; i < array.length; i++) {
            combined = op.operate(combined, array[i]);
        }
        return combined;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    @FunctionalInterface
    static interface Op {
        double operate(double a, double b);
    }
}
