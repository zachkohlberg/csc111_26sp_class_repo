import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private int size;
    private Node front, back;

    public LinkedQueue() {
        size = 0;
        front = null;
        back = null;
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
        // can't remove from an empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E element = front.data;

        size -= 1;
        front = front.next;
        // not necessary unless we rely on back == null to tell us when queue
        // is empty:
        // if (isEmpty()) {
        //     back = null;
        // }

        return element;
    }

    public E peek() {
        // can't peek at an empty queue
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return front.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        Node n = front;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    // inner class for node
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
