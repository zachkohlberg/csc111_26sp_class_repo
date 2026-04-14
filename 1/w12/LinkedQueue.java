import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    // TODO: data

    public LinkedQueue() {
        // TODO init
    }

    public void enqueue(E element) {
        // TODO
    }

    public E dequeue() {
        // can't remove from an empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E element = ???;

        // TODO

        return element;
    }

    public E peek() {
        // can't peek at an empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return ???;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        // TODO
    }

    public void clear() {
        // TODO
    }
}
