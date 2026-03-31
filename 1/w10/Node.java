class Node<T> {
    T data;
    Node<T> next;

    Node() {
    }

    Node(T d) {
        data = d;
        next = null;
    }

    Node(T d, Node<T> n) {
        data = d;
        next = n;
    }
}
