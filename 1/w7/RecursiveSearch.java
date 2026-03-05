public class RecursiveSearch {
    public int linearSearch(int[] array, int start, int end, int target) {
        // base case: failure
        // must be before success to avoid out of bounds error
        if (start == end) {
            return -1;
        }

        // base case: success
        if (array[start] == target) {
            return start;
        }

        // recursive case
        return linearSearch(array, start + 1, end, target);
    }

    public int binarySearch(int[] array, int start, int end, int target) {
        // base case: failure
        if (start == end) {
            return -1;
        }

        int mid = (start + end) / 2;

        // base case: success
        if (array[mid] == target) {
            return mid;
        }

        // recursive cases
        if (target < array[mid]) {
            // target in first half
            return binarySearch(array, start, mid, target);
        } else {
            // target in second half
            return binarySearch(array, mid + 1, end, target);
        }
    }
}
