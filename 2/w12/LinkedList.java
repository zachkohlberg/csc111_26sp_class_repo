public class LinkedQueue<E> {
    private Node ???;
    private int size;

    public LinkedQueue() {
        // TODO
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        // TODO
        size = 0;
    }

    public void enqueue(E element) {
    }

    public E dequeue() {
        // can't remove from empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    public E peek() {
        // can't peek at empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

    }

    private class Node {
        E data;
        Node next;

        Node() {}
        Node(E d) {
            data = d;
        }
        Node(E d, Node n) {
            data = d;
            next = n;
        }
    }
}
