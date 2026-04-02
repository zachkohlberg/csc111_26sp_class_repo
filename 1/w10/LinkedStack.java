import java.util.EmptyStackException;

public class LinkedStack<E> {
    private Node head;
    private int size;

    public LinkedStack() {
        head = null;
        size = 0;
    }

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

    public void push(E element) {
        head = new Node(element, head);
        size += 1;
    }

    public E pop() {
        // can't remove an element from an empty stack
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E element = head.data;
        head = head.next;
        size -= 1;
        return element;
    }

    public E peek() {
        // can't peek at an element on an empty stack
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return head.data;
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
