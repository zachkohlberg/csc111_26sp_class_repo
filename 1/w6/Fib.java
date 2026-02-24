public class Fib {
    public static void main(String[] args) {
        for (long n = 1; n < 100; n++) {
            System.out.printf("fib(%d) = %d\n", n, fibIter(n));
        }
    }

    public static long fib(long n) {
        if (n <= 2) {
            // base case
            return 1;
        } else {
            // recursive case
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long fibIter(long n) {
        long f1 = 1;
        long f2 = 1;
        for (long i = 3; i <= n; i++) {
            long t = f1 + f2;
            f1 = f2;
            f2 = t;
        }
        return f2;
    }
}
