public class IntArrayList {
    public static final int DEFAULT_CAPACITY = 10;

    int[] data;
    int size;

    public IntArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // how much space is in the data array
    public int capacity() {
        return data.length;
    }

    // how much space we're using, how many elements are in the list
    public int size() {
        return size;
    }

    public int get(int index) {
        // bounds check
        // - must be less than size, don't care about data.length
        // - size is more restrictive and will always be <= data.length, so no
        //   worry about going out of data's bounds
        // - don't want to allow access to the unused section of data from size
        //   to data.length - 1
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        // after bounds check, we can safely return data[index]
        return data[index];
    }

    public void insert(int index, int element) {
        // bounds check
        // - size is acceptable because that will be in bounds after the size
        //   increases

        // make sure we have space for the new element
        // shift elements over to make room for the new element
        // add the new element at data[index]
        // increase the list size
    }

    public int removeAt(int index) {
        // bounds check

        // save element in a temporary variable so we can return it later
        // shift elements over, deleting the element we're removing
        // decrease size
        // (if we're storing references) null data[size]
        // return removed element
    }

    public int indexOf(int element) {
        // linear search for element
        // - only search from 0 to size - 1, not the whole data array
        // return -1 if not found
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        // make sure we have space
        // store element at data[size]
        // increase size
    }

    public boolean remove(int element) {
        // get index of element
        // if -1, return false
        // else, removeAt(i) and return true
    }

    public void clear() {
        // (if we're storing references) null everything from 0 to size -1
        // size = 0
    }
}
