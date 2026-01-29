public class FizzBuzz {
    public static void main(String[] args) {
        // to add beep, we go from
        //
        // FizzBuzz
        // Buzz
        // Fizz
        // #
        //
        // to
        //
        // FizzBuzzBeep
        // BuzzBeep
        // FizzBeep
        // Beep
        // FizzBuzz
        // Buzz
        // Fizz
        // #
        //
        for (int i = 1; i <= 200; i++) {
            // if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            //     System.out.println("FizzBuzzBeep");
            // } else if (i % 5 == 0 && i % 7 == 0) {
            //     System.out.println("BuzzBeep");
            // } else if (i % 3 == 0 && i % 7 == 0) {
            //     System.out.println("FizzBeep");
            // } else if (i % 7 == 0) {
            //     System.out.println("Beep");
            // } else if (i % 3 == 0 && i % 5 == 0) {
            //     System.out.println("FizzBuzz");
            // } else if (i % 5 == 0) {
            //     System.out.println("Buzz");
            // } else if (i % 3 == 0) {
            //     System.out.println("Fizz");
            // } else {
            //     System.out.println(i);
            // }

            boolean printNumber = true;

            if (i % 3 == 0) {
                System.out.print("Fizz");
                printNumber = false;
            }

            if (i % 5 == 0) {
                System.out.print("Buzz");
                printNumber = false;
            }

            if (i % 7 == 0) {
                System.out.print("Beep");
                printNumber = false;
            }

            if (i % 11 == 0) {
                System.out.print("Huh?");
                printNumber = false;
            }

            if (i % 13 == 0) {
                System.out.print("????");
                printNumber = false;
            }

            if (printNumber) {
                System.out.println(i);
            } else {
                System.out.println();
            }
        }
    }
}
