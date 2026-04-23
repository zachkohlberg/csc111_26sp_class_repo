public class BTNode<T> {
    T data;
    BTNode<T> left, right;

    BTNode() {}

    BTNode(T d) {
        data = d;
    }

    BTNode(T d, BTNode<T> l, BTNode<T> r) {
        data = d;
        left = l;
        right = r;
    }
}
