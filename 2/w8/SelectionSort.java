public class SelectionSort {
    private int swaps, comparisons;

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }

    // sort(arr):
    // for each swapIndex from arr.length - 1 until 0
    //     greatest = 0
    //     for each i from 1 to swapIndex
    //         if arr[i] > arr[greatest]
    //             greatest = i
    //     swap arr, greatest, swapIndex
    public void sort(int[] a) {
        for (int swapIndex = a.length - 1; swapIndex > 0; swapIndex--) {
            int indexOfGreatest = 0;
            for (int index = 1; index <= swapIndex; index++) {
                if (a[index] > a[indexOfGreatest]) {
                    indexOfGreatest = index;
                }
            }
            int t = a[indexOfGreatest];
            a[indexOfGreatest] = a[swapIndex];
            a[swapIndex] = t;
            // SortHelper.swap(a, indexOfGreatest, swapIndex);
        }
    }

    // sort while tracking comparisons and swaps
    public void sortTrack(int[] a) {
        for (int swapIndex = a.length - 1; swapIndex > 0; swapIndex--) {
            int indexOfGreatest = 0;
            for (int index = 1; index <= swapIndex; index++) {
                // must do this outside the if statement body to count ALL comparisons
                comparisons++;
                if (a[index] > a[indexOfGreatest]) {
                    // don't count comparisons here, this only runs for TRUE comparisons, not
                    // FALSE comparisons, and we need to count both
                    indexOfGreatest = index;
                }
            }

            swaps++;
            SortHelper.swap(a, indexOfGreatest, swapIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = SortHelper.randomArray(100000, 1, 100);

        SelectionSort sorter = new SelectionSort();

        long start = System.nanoTime();

        sorter.sortTrack(array);

        long end = System.nanoTime();
        long duration = end - start;

        System.out.printf("Is the array sorted? %s\n", SortHelper.isSorted(array));
        System.out.printf("Swaps = %d, Comparisons = %d\n", sorter.getSwaps(), sorter.getComparisons());
        System.out.printf("Duration = %d.%03d\n", duration / 1_000_000_000, duration / 1_000_000 % 1_000);
    }
}
