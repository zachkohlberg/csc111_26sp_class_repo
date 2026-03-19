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

        int[] array = SortHelper.randomArray(10, 1, 100);

        sorter.sort(array);
        System.out.println("Is array sorted? " + SortHelper.isSorted(array));
        System.out.println("Swaps = " + sorter.getSwaps());
        System.out.println("Comparisons = " + sorter.getComparisons());
    }
}
