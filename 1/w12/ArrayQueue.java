import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    public static final int DEFAULT_CAPACITY = 10;

    // NOTE: we ended up adding the proper resize code later, so this queue will
    // resize like our other array-based data structures. We could disable this
    // and uncomment the exception in enqueue to revert to fixed size.

    // TODO: (optional) have the constructor take a parameter `boolean fixedSize`
    // to indicate whether the queue should grow or throw an exception when
    // enqueueing with a full queue. Also add a method `isFull()` to check
    // whether full so the user can more easily check before triggering exception.

    private int front, back, size;
    private E[] data;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        data = (E[])(new Object[DEFAULT_CAPACITY]);
        front = 0;
        back = 0;
        size = 0;
    }

    public void enqueue(E element) {
        ensureCapacity();

        // this isn't needed if queue can grow
        // // can't add to a full queue
        // if (size() == capacity()) {
        //     throw new IllegalStateException();
        // }

        // place element in array
        data[back] = element;
        // update back
        back = (back + 1) % data.length;
        // update size
        size += 1;
    }

    public E dequeue() {
        // can't remove from an empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E element = data[front];

        // remove reference to element
        data[front] = null;
        // update front
        front = (front + 1) % data.length;
        // update size
        size -= 1;

        return element;
    }

    public E peek() {
        // can't peek at an empty queue
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

    // iterates over the queue elements in order, even if the in-use portion of
    // the data array wraps around from the end to the start
    public void printQueue() {
        for (int offset = 0; offset < size; offset++) {
            int i = (front + offset) % data.length;
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        // Practice solution: nulls all elements of array
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

    // not supported in this version
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        // Practice solution (copy to beginning, discarding wrapped layout)
        if (size() == capacity()) {
            E[] newData = (E[])new Object[size() * 2];
            // use the proper loop to iterate over queue data
            for (int offset = 0; offset < size; offset++) {
                int oldIndex = (front + offset) % data.length;
                int newIndex = offset;
                newData[newIndex] = data[oldIndex];
            }
            data = newData;
            // update front and back now that we've placed queue data at
            // beginning of the array
            front = 0;
            back = size;
        }
    }

    // we could declare our own queue exceptions if we wanted more specific
    // exception types:
    // public static class EmptyQueueException extends RuntimeException {}
    // public static class FullQueueException extends RuntimeException {}
}
