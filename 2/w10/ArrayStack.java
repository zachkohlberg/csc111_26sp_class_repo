import java.util.EmptyStackException;

public class ArrayStack<E> {
    public static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        data = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(E element) {
        data[size] = element;
        size += 1;
    }

    public E pop() {
        // can't remove from an empty stack
        if (isEmpty()) {
            throw EmptyStackException();
        }

        size -= 1;
        E element = data[size];
        data[size] = null;
        return element;
    }

    public E peek() {
        // can't peek at an empty stack
        if (isEmpty()) {
            throw EmptyStackException();
        }

        return data[size - 1];
    }

    // these are the same as the array stack

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    // same array management as arraylist

    public int capacity() {
        return data.length;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size() == capacity()) {
            E[] newData = (E[])new Object[size() * 2];
            for (int i = 0; i < size(); i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
}
