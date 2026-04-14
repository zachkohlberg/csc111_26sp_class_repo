import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private Node front, back;
    private int size;

    public LinkedQueue() {
        front = null;
        back = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    public void enqueue(E element) {
        if (isEmpty()) {
            back = new Node(element);
            front = back;
        } else {
            back.next = new Node(element);
            back = back.next;
        }

        size += 1;
    }

    public E dequeue() {
        // can't remove from empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E element = front.data;

        size -= 1;
        front = front.next;
        // if we needed back to be null when the queue is empty, then we'd do this:
        // if (isEmpty()) {
        //     back = null;
        // }

        return element;
    }

    public E peek() {
        // can't peek at empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return front.data;
    }

    public void printQueue() {
        Node n = front;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
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
