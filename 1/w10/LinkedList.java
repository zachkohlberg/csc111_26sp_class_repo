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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        // start at head
        Node n = head;
        // advance by INDEX nodes
        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        return n.data;
    }

    public void insert(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }

        // TODO: special cases
        // already looked at insert(size, e) but could use a review

        // start at head
        Node n = head;
        // advance by INDEX-1 nodes
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }

        // n is the node at INDEX - 1
        // make a new node pointing to n.next (INDEX, now INDEX + 1)
        // point n.next to the new node
        n.next = new Node(element, n.next);
    }

    public int removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

    }

    public int indexOf(int element) {
    }

    public boolean remove(int element) {
    }

    public void add(int element) {
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
