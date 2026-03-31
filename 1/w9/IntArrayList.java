public class IntArrayList {
    public static final int DEFAULT_CAPACITY = 10;

    private int[] data;
    private int size;

    public IntArrayList() {
        // make array with default size
        data = new int[DEFAULT_CAPACITY];
        // size defaults to 0 (list empty)
        size = 0;
    }

    public int get(int index) {
        // bounds check
        // - not checking the data array, because the unused portion is also out
        //   of bounds
        // - size will always be <= the data array's length, so if we're in
        //   bounds relative to size then we're also in bonuds relative to the
        //   data array
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        return data[index];
    }

    public void insert(int index, int element) {
        // bounds check
        // - we allow index == size because inserting at size won't fragment the
        //   data stored in the array
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }

        // ensure data is large enough to hold element
        ensureCapacity();
        // shift elements over to make room for the new element
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        // store new element at data[index]
        data[index] = element;
        // increase size
        size = size + 1;
    }

    public int removeAt(int index) {
        // bounds check
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        // store element in a temp variable so we can return it later
        int element = data[index];
        // shift elements over, covering the element at index
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        // decrease size
        size = size - 1;
        // (if our data contains references, not primitives) null data[size]

        // return element from temp variable
        return element;
    }

    public int indexOf(int element) {
        // linear search for element
        // return -1 if not found
        // TODO: implement, refer to linear search from a few weeks ago
    }

    public int size() {
        return size;
    }

    // only applies to array-based lists, not linked lists
    public int capacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(int element) {
        // TODO: implement using indexOf and removeAt
        // find element (indexOf)
        // if found, remove at index and return true
        // if not found, return false
    }

    public void clear() {
        // (if our list contains objects and not primitives) null each element
        // set size to 0
        size = 0;
    }

    public void add(int element) {
        // insert(0, element)
        // or
        // ensure we have room for the element
        ensureCapacity();
        // data[size] = element
        data[size] = element;
        // increase size
        size = size + 1;
    }

    private void ensureCapacity() {
        // only resize if data array is full
        if (size == data.length) {
            // make a new larger array, typically we just double previous size
            int[] newData = new int[size * 2];
            // copy data to new array
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            // replace old data array with new data array
            data = newData;
        }
    }
}
