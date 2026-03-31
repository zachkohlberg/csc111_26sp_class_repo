class Node<T> {
    T data;
    Node<T> next;

    public Node() {}

    public Node(T d) {
        data = d;
    }

    public Node(T d, Node<T> n) {
        data = d;
        next = n;
    }
}
