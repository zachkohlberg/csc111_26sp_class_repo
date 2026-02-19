public class Factorial {
    static long factorial(long n) {
        // we're in the base case when n is 1 or less
        if (n <= 1) {
            // base case
            // result is 1 in the base case
            return 1;
        } else {
            // recursive case
            // work: we multiply by n right now
            // smaller problem: we delegate the factorial of n-1 to the recursive call
            return n * factorial(n - 1);

            // // smaller problem:
            // long f = factorial(n - 1);
            //
            // // our part:
            // long result = n * f;
            //
            // return result;
        }
    }

    static long factorialIterative1(long n) {
        long product = 1;
        for (long i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    static long factorialIterative2(long n) {
        long product = 1;
        for (long i = n; i >= 1; i--) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(factorial(20));
        System.out.println(factorialIterative1(20));
        System.out.println(factorialIterative2(20));
    }
}
