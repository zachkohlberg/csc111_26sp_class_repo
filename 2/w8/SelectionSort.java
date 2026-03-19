public class SelectionSort {
    public static void main(String[] args) {
        int[] array = SortHelper.randomArray(10, 1, 100);

        SelectionSort sorter = new SelectionSort();

        sorter.sort(array);

        System.out.printf("Is the array sorted? %s\n", SortHelper.isSorted(array));
        System.out.printf("Swaps = %d, Comparisons = %d\n", sorter.getSwaps(), sorter.getComparisons());
        // System.out.printf("Duration = %d.%03d\n", duration / 1_000_000_000, duration / 1_000_000 % 1_000);
    }
}
