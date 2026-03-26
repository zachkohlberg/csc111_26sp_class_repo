// generic data structure needs a type parameter
// E is the standard name for elements of a collection
public class ArrayList<E> {
    public static final int DEFAULT_CAPACITY = 10;

    E[] data;
    int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        // supress the warning for casting from Object[] to E[]
        data = (E[])new Object[DEFAULT_CAPACITY];
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

    public E get(int index) {
        // bounds check
        // - must be less than size, don't care about data.length
        // - size is more restrictive and will always be <= data.length, so no
        //   worry about going out of data's bounds
        // - don't want to allow access to the unused section of data from size
        //   to data.length - 1
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // after bounds check, we can safely return data[index]
        return data[index];
    }

    public void insert(int index, E element) {
        // bounds check
        // - size is acceptable because that will be in bounds after the size
        //   increases
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // make sure we have space for the new element
        ensureCapacity();
        // shift elements over to make room for the new element
        for (int i = size(); i > index; i--) {
            data[i] = data[i - 1];
        }
        // add the new element at data[index]
        data[index] = element;
        // increase the list size
        size += 1;
    }

    public E removeAt(int index) {
        // bounds check
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // save element in a temporary variable so we can return it later
        E element = data[index];
        // decrease size
        size -= 1;
        // shift elements over, deleting the element we're removing
        for (int i = index; i < size(); i++) {
            data[i] = data[i + 1];
        }
        // (if we're storing references) null data[size]
        data[size] = null;
        // return removed element
        return element;
    }

    public int indexOf(E element) {
        // TODO: code this, you have linear search examples to reference
        // linear search for element
        // - only search from 0 to size - 1, not the whole data array
        // return -1 if not found
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        // make sure we have space
        ensureCapacity();
        // store element at data[size]
        data[size] = element;
        // increase size
        size += 1;
    }

    public boolean remove(E element) {
        // get index of element
        int index = indexOf(element);
        if (index == -1) {
            // if -1, return false
            return false;
        } else {
            // else, removeAt(i) and return true
            removeAt(index);
            return true;
        }
    }

    public void clear() {
        // (if we're storing references) null everything from 0 to size -1
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        // size = 0
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        // check whether we're full
        if (size() == capacity()) {
            // make a new larger array (usually double the old size)
            E[] newData = (E[])new Object[size() * 2];
            // copy data to larger array
            for (int i = 0; i < size(); i++) {
                newData[i] = data[i];
            }
            // replace data with new array
            data = newData;
        }
    }
}
