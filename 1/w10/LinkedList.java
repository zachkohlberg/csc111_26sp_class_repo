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

        if (index == 0) {
            head = new Node(element, head);
        } else {
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

        size += 1;
    }

    public E removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        E element;

        if (index == 0) {
            // save the data in head before we lose access to it
            element = head.data;
            head = head.next;
        } else {
            // start at head
            Node n = head;
            // advance by INDEX-1 nodes
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            // need to save the data before we lose our last reference to this node
            element = n.next.data;

            // skip over the next node to remove it
            // GC will free that memory at some point for us
            n.next = n.next.next;
        }

        size -= 1;

        return element;
    }

    public int indexOf(E element) {
        // TODO: try implementing this one yourself!
        // linear search with node traversal
    }

    public boolean remove(E element) {
        // exact same implementation as ArrayList works here
        // this is just using our list ADT's operations, which are shared by
        // all implementations of our list ADT
        int index = indexOf(element);
        if (index == -1) {
            return false;
        } else {
            removeAt(index);
            return true;
        }
    }

    public void add(E element) {
        // easy to implement add using insert
        insert(size(), element);

        // or we can just copy the relevant insert code to add to the end of the list
        // start at head
        // Node n = head;
        // // advance by size - 1 nodes
        // for (int i = 0; i < size - 1; i++) {
        //     n = n.next;
        // }
        //
        // n.next = new Node(element, n.next);
        // size += 1;
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
