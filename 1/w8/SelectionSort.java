public class SelectionSort {
    private int comparisons, swaps;

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    public void sort(int[] a) {
        for (int swapIndex = a.length - 1; swapIndex >= 0; swapIndex--) {
            // find largest unsorted element
            int indexOfGreatest = 0;
            for (int index = 1; index <= swapIndex; index++) {
                if (a[index] > a[indexOfGreatest]) {
                    indexOfGreatest = index;
                }
            }

            // swap largest unsorted element into place
            int t = a[indexOfGreatest];
            a[indexOfGreatest] = a[swapIndex];
            a[swapIndex] = t;
        }
    }

    public void sortTrack(int[] a) {
        for (int swapIndex = a.length - 1; swapIndex > 0; swapIndex--) {
            int indexOfGreatest = 0;
            for (int index = 1; index <= swapIndex; index++) {
                // we increment outside the if statement so that we track EVERY comparison, not just
                // the comparisons that result in true
                comparisons++;
                if (a[index] > a[indexOfGreatest]) {
                    // common mistake is to increment comparisons in here, which only counts the
                    // comparisons the result in true and ignores the others
                    indexOfGreatest = index;
                }
            }

            swaps++;
            SortHelper.swap(a, indexOfGreatest, swapIndex);
        }
    }

    // sort(arr):
    public void sortCommented(int[] a) {
        // for each swapIndex from arr.length - 1 to 0
        for (int swapIndex = a.length - 1; swapIndex >= 0; swapIndex--) {
            // greatest = 0
            int indexOfGreatest = 0;
            // for each i from 1 to swapIndex
            for (int index = 1; index <= swapIndex; index++) {
                // if arr[i] > arr[greatest]
                if (a[index] > a[indexOfGreatest]) {
                    // greatest = i
                    indexOfGreatest = index;
                }
            }
            // swap arr, greatest, swapIndex
            int t = a[indexOfGreatest];
            a[indexOfGreatest] = a[swapIndex];
            a[swapIndex] = t;
            // SortHelper.swap(a, indexOfGreatest, swapIndex);
        }
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();

        int[] array = SortHelper.randomArray(10000, 1, 100);

        long start = System.nanoTime();

        sorter.sortTrack(array);

        long end = System.nanoTime();

        long duration = end - start;

        System.out.println("Is array sorted? " + SortHelper.isSorted(array));
        System.out.println("Swaps = " + sorter.getSwaps());
        System.out.println("Comparisons = " + sorter.getComparisons());
        System.out.printf("Time = %d.%03d seconds\n", duration / 1_000_000_000, duration / 1_000_000 % 1_000);
    }
}
