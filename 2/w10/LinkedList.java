public class LinkedList<E> {
    private Node head;
    private int size;

    public LinkedList() {
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

    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // start at head node
        Node n = head;
        // traverse INDEX nodes into the chain
        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        return n.data;
    }

    public void insert(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // special case could be avoided by adding a dummy node at the start
        if (index == 0) {
            head = new Node(element, head);
        } else {
            // start at head node
            Node n = head;
            // traverse INDEX-1 nodes into the chain
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            n.next = new Node(element, n.next);
        }

        size += 1;

    }

    public E removeAt(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }

        // save the element we're about to delete
        E element;

        if (index == 0) {
            e = head.data;
            head = head.next;
        } else {
            // start at head node
            Node n = head;
            // traverse INDEX-1 nodes into the chain
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            e = n.data;
            // skip over the next node
            n.next = n.next.next;
        }

        size -= 1;
        return e;
    }

    public int indexOf(E element) {
        // traverse list, but otherwise just a linear search
    }

    public void add(E element) {
    }

    public boolean remove(E element) {
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
