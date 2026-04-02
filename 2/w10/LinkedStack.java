import java.util.EmptyStackException;

public class LinkedStack<E> {
    private Node head;
    private int size;

    public LinkedStack() {
        head = null;
        size = 0;
    }

    public void push(E element) {
        head = new Node(element, head);
        size += 1;
    }

    public E pop() {
        // can't remove from an empty stack
        if (isEmpty()) {
            throw EmptyStackException();
        }

        size -= 1;
        E element = head.data;
        head = head.next;
        return element;
    }

    public E peek() {
        // can't peek at an empty stack
        if (isEmpty()) {
            throw EmptyStackException();
        }

        return head.data;
    }

    // all the same as linked list

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
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
