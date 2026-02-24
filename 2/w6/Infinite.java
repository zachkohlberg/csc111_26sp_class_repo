public class Infinite {
    public static void main(String[] args) {
        //
        factorial(5);
    }

    public static int factorial(int n) {
        // recursive case
        return n * factorial(n - 1);

        // base case? none
        // this will never stop calling itself
    }
}

// example of how people accidentally write recursive functions
// when they should be writing nonrecursive functions
//
// class Monster {
//     double health;
//
//     public double getHealth() {
//         return getHealth();
//     }
// }
