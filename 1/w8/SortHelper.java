public class SortHelper {
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static int[] randomArray(int len, int min, int max) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (max - min)) + min;
        }
        return array;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < array.length - 1; i++) {
            // check if element violates sorted property
            if (array[i] > array[i + 1]) {
                return false;
            }
            // longer version:
            // if (!(array[i] <= array[i + 1])) {
            //     return false;
            // }
        }

        return true;
    }
}
