public class RecursiveSearch {
    public static void main(String[] args) {
        int[] array = generateArray(1_000);

        int index = binarySearch(array, 0, array.length, 7);

        System.out.println(index);
        if (index != -1) {
            System.out.println(array[index]);
        }
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * size);
        }
        return array;
    }

    public static int linearSearch(int[] array, int start, int end, int target) {
        // base case: fail
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

    public static int binarySearch(int[] array, int start, int end, int target) {
        // base case: fail
        if (start == end) {
            return -1;
        }

        int mid = (start + end) / 2;

        // base case: success
        if (array[mid] == target) {
            return mid;
        }

        // recursive case: lower
        if (target < array[mid]) {
            return binarySearch(array, start, mid, target);
        }

        // recursive case: upper
        return binarySearch(array, mid + 1, end, target);
    }
}
