/**
 * Implements an algorithm to guess a secret number. This starter version performs a linear search,
 * but you can improve it by switching to a binary search.
 *
 * @author Zach Kohlberg
 * @author YOU, after you rewrite this!
 */
public class GuessBot {
    public static void main(String[] args) {
        // choose a secret number from 1 to 1 billion
        SecretNumber secret = new SecretNumber();

        // shows what secret number will tell us before guessing
        System.out.println("Secret number:");
        System.out.println(secret);

        // use some algorithm to figure out the number
        // NOTE: added arguments here
        int guess = findSecret(secret, SecretNumber.MIN_VALUE, SecretNumber.MAX_VALUE);

        // guess the number once we've figured it out
        secret.guessSecret(guess);

        // shows whether we guessed correctly
        // we will ALWAYS guess correctly if we correctly implemented our algorithm
        // we want to guess correctly with the fewest possible queries
        System.out.println("Secret number:");
        System.out.println(secret);
    }

    // NOTE: added parameters for min/max
    static int findSecret(SecretNumber secret, int min, int max) {
        // NOTE: deleted loop, replace with binary search code

        // base case: min = max, return min or max
        if (min == max) {
            return min;
        }

        int mid = (min + max) / 2;

        if (secret.isGreaterThan(mid)) {
            // recursive case 1: number > mid, search mid + 1 to max
            return findSecret(secret, mid + 1, max);
        } else {
            // recursive case 2: number <= mid, search min to mid
            return findSecret(secret, min, mid);
        }
    }
}

