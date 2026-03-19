public class SortHelper {
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static int[] randomArray(int len, int min, int max) {
        int[] a = new int[len];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (max - min)) + min;
        }

        return a;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        // this also works
        // for (int i = 0; i < a.length - 1; i++) {
        //     if (a[i] > a[i + 1]) {
        //         return false;
        //     }
        // }

        return true;
    }
}
