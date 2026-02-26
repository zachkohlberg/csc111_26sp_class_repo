public class Fib {
    public static void main(String[] args) {
        // you can make code blocks like this to limit the scope of variables
        {
            long start = System.nanoTime();
            for (long n = 1; n <= 100; n++) {
                System.out.printf("fib(%d) = %d\n", n, fibRecGood(n, 0, 1));
            }
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.printf("Took %d nanoseconds to calculate 100 fibonacci numbers recursively.\n", elapsed);
        }

        {
            long start = System.nanoTime();
            long f = fib(45);
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.printf("Took %d nanoseconds to calculate fib(45).\n", elapsed);
        }
    }

    // bad implementation, takes estimated millions of years for first 100 numbers
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
        long prev = 1;
        long curr = 1;
        for (long i = 3; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // get the nth fibonacci number starting at curr
    // - if n = 1, that would be curr
    // - if n = 2, that would be prev + curr
    // - and so on
    public static long fibRecGood(long n, long prev, long curr) {
        if (n == 1) {
            // base case
            return curr;
        } else {
            // recursive case
            return fibRecGood(n - 1, curr, prev + curr);
        }
    }
}
