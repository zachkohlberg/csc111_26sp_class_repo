import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(100));
        System.out.println(factorial(new BigInteger("100")));
        System.out.println(factorialIter1(100));
        System.out.println(factorialIter2(100));
    }

    // assumes n is positive
    public static long factorial(long n) {
        // condition for base case
        if (n == 1) {
            // base case
            return 1;
        } else {
            // recursive case
            return n * factorial(n - 1);

            // longer version to highlight the different parts:
            // // solve smaller problem
            // long f = factorial(n - 1);
            //
            // // our contribution is to multiply by n
            // long result = f * n;
            //
            // return result;
        }
    }

    // big integer version for n greater than 20
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
    public static long factorialIter1(long n) {
        long product = 1;

        for (long i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    public static long factorialIter2(long n) {
        long product = 1;

        for (long i = n; i >= 1; i--) {
            product *= i;
        }

        return product;
    }
}
