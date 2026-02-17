public class Recursion {
    public static void main(String[] args) {
        countUpIter(3);
        countUpRec(3);
    }

    public static void countUpIter(int start) {
        // problem: count from start to 10 iteratively (using a loop)
        // where do we start? at start
        // when are we done? after 10 repetitions, when i is greater than 10
        // what do we actually do in the loop?
        //   - print one number
        //   - increment i to track repetitions
        for (int i = start; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void countUpRec(int start) {
        // problem: count from 1 to 10 recursively
        // where do we start? at start (can't hard-code this so easily)
        // when are we done? when start is 10
        // what do we actually do in the function?
        //   - print one number
        //   - call the function to print the rest of the numbers

        // print one number
        System.out.println(start);
        // if start is less than 10, then we're not done
        if (start < 10) {
            // recursive case
            // let countUpRec print the rest
            countUpRec(start + 1);
        } else {
            // base case
            // we're done, do nothing
        }
    }
}
