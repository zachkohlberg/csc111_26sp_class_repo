public class Recursion {
    public static void main(String[] args) {
        countUpIter();
        countUpRec(1);
    }

    public static void countUpIter() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void countUpRec(int start) {
        // small step towards solving the problem
        System.out.println(start);

        if (start < 10) {
            // recursive case: calls itself
            // ask someone to solve the rest
            // give them a smaller version of the problem (start at next number)
            countUpRec(start + 1);
        } else {
            // base case: no recursion
            // do nothing
        }
    }

    // short version:
    // public static void countUpRec(int start) {
    //     System.out.println(start);
    //     if (start < 10) {
    //         countUpRec(start + 1);
    //     }
    // }
}
