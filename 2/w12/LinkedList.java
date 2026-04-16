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
            element = head.data;
            head = head.next;
        } else {
            // start at head node
            Node n = head;
            // traverse INDEX-1 nodes into the chain
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            // need to save our element before removing the node
            element = n.next.data;
            // skip over the next node
            n.next = n.next.next;
        }

        size -= 1;
        return e;
    }

    public int indexOf(E element) {
        // TODO: try implementing this on your own
        // traverse list, but otherwise just a linear search
    }

    public void add(E element) {
        // this is inefficient, O(n)
        insert(size, element);

        // if we maintained a pointer to the tail node, then this would be O(1)
        // we're not making any such optimizations for our first linked list,
        // but we may revisit this and make some improvements
    }

    public boolean remove(E element) {
        // this code only uses operations defined in our list ADT, so it works
        // for both this linked list implementation and the other array list
        // implementation
        int index = indexOf(element);
        if (index == -1) {
            return false;
        } else {
            removeAt(index);
            return true;
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
