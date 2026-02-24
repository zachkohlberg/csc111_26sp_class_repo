public class Fib {
    public static void main(String[] args) {
        for (long n = 1; n <= 100; n++) {
            System.out.printf("fib(%d) = %d\n", n, fibIter(n));
        }

        // long total = 0;
        // for (long i = 0; i <= 20365011074L; i++) {
        //     total++;
        // }
        // System.out.println(total);
        //
        // long f = fib(51);
        // System.out.println(f);
    }

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
        long f = 1;
        long fPrev = 1;
        for (long i = 3; i <= n; i++) {
            long temp = f + fPrev;
            fPrev = f;
            f = temp;
        }
        return f;
    }
}
