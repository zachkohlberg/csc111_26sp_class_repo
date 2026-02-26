public class Fib {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // for (long n = 1; n <= 100; n++) {
        //     System.out.printf("fib(%d) = %d\n", n, fibRecGood(n, 0, 1));
        // }
        long x = fib(45);
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.printf("Took %d nanoseconds to calculate fib(45) = %d.\n", elapsed, x);
        // System.out.printf("Took %d nanoseconds to calculate the first hundred fibonacci numbers.\n", elapsed);

        // long total = 0;
        // for (long i = 0; i <= 20365011074L; i++) {
        //     total++;
        // }
        // System.out.println(total);
        //
        // long f = fib(51);
        // System.out.println(f);
    }

    // really bad implementation (slow), but really good representation of the
    // fibonacci sequence
    public static long fib(long n) {
        if (n <= 2) {
            // base case
            return 1;
        } else {
            // recursive case
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static long fibIter(long n) {
        long curr = 1;
        // if we start with current as the first number, then there is no previous number
        long prev = 0;
        for (long i = 2; i <= n; i++) {
            long next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // given current and previous number in the fibonacci sequence,
    // what is the nth number starting at the current number
    public static long fibRecGood(long n, long prev, long curr) {
        if (n <= 1) {
            // base case
            return curr;
        } else {
            // recursive case
            return fibRecGood(n - 1, curr, prev + curr);
        }
    }
}
