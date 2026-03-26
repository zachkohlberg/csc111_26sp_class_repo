public class IntArrayList {
    public static final int DEFAULT_CAPACITY = 10;

    int[] data;
    int size;

    public IntArrayList() {
        // make array with default size
        data = new int[DEFAULT_CAPACITY];
        // size defaults to 0 (list empty)
        size = 0;
    }

    public int get(int index) {
        // throw an exception if index is out of bounds
        //   (out of bounds for the list, not the data array)
        // return data[index] if it's in bounds
    }

    public void insert(int index, int element) {
        // bounds check
        // ensure data is large enough to hold element
        // shift elements over to make room for the new element
        // store new element at data[index]
        // increase size
    }

    public int removeAt(int index) {
        // bounds check
        // store element in a temp variable so we can return it later
        // shift elements over, covering the element at index
        // return element from temp variable
        // decrease size
    }

    public int indexOf(int element) {
        // linear search for element
        // return -1 if not found
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(int element) {
        // find element (indexOf)
        // if found, remove at index and return true
        // if not found, return false
    }

    public void clear() {
        // (if our list contains objects and not primitives) null each element
        // set size to 0
    }

    public void add(int element) {
        // insert(0, element)
        // or
        // ensure we have room for the element
        // data[size] = element
        // increase size
    }
}
