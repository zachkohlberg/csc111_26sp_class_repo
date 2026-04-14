import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    public static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int front, back, size;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        data = (E[])new Object[DEFAULT_CAPACITY];
        front = 0;
        back = 0;
        size = 0;
    }

    public void printQueue() {
        for (int offset = 0; offset < size; offset++) {
            int i = (front + offset) % data.length;
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void enqueue(E element) {
        // call ensureCapacity instead of throwing an exception
        // to make the queue grow dynamically instead of remaining
        // a fixed size:
        ensureCapacity();

        // // can't add to full queue
        // if (size() == capacity()) {
        //     throw new IllegalStateException();
        // }

        data[back] = element;
        back = (back + 1) % data.length;
        size += 1;
    }

    public E dequeue() {
        // can't remove from empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E element = data[front];

        data[front] = null;
        front = (front + 1) % data.length;
        size -= 1;

        return element;
    }

    public E peek() {
        // can't peek at empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return data[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        // Practice solution:
        for (int offset = 0; offset < size; offset++) {
            int i = (front + offset) % data.length;
            data[i] = null;
        }
        front = 0;
        back = 0;
        size = 0;
    }

    public int capacity() {
        return data.length;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size() == capacity()) {
            E[] newData = (E[])new Object[size() * 2];
            // Practice solution:
            for (int offset = 0; offset < size; offset++) {
                int oldIndex = (front + offset) % data.length;
                int newIndex = offset;
                newData[newIndex] = data[oldIndex];
            }
            data = newData;
            front = 0;
            back = size;
        }
    }
}
