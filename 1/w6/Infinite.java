public class Infinite {
    public static void main(String[] args) {
        // crashes with a giant stack trace and a StackOverflowError
        System.out.println(factorial(5));
    }

    // infinite recursion
    public static int factorial(int n) {
        // recursive case
        return n * factorial(n - 1);

        // where's the base case?
    }
}
