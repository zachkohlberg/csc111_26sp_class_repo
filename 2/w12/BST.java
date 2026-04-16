public class BST {
    private BTNode<String> root;

    public BST() {
        root = null;
    }

    // nonrecursive part
    // if root is empty, create root node with new item
    // if root is not empty, attempt to insert as a child of root
    public void insert(String element) {
        if (root == null) {
            // empty tree is a special case
            root = new BTNode<>(element);
        } else {
            // nonempty tree requires recursion
            insert(root, element);
        }
    }

    // recursive part
    // to insert as a child of node N:
    //     if new item is <= N’s element
    //         if N has a left child, then attempt to insert as a child of N’s left child
    //         if N has no left child, then create a left child with new item
    //     if new item is > N’s element
    //         if N has a right child, then attempt to insert as a child of N’s right child
    //         if N has no right child, then create a right child with new item
    private void insert(BTNode<String> node, String element) {
        // TODO: use compareTo to figure out whether element is <= node.data
        if (element <= node.data) { // can't use <= with strings
            // left branch
            if (node.left != null) {
                // nonempty branch = recursive case
                insert(node.left, element);
            } else {
                // empty branch = base case
                node.left = new BTNode<>(element);
            }
        } else {
            // right branch
            // TODO: code the right branch, basically the same as the
            // left branch
        }
    }

    // nonrecursive part
    // if root is empty, return false
    // if root is not empty, search root recursively
    public boolean contains(String element) {
        if (root == null) {
            return false;
        } else {
            return contains(root, element);
        }
    }

    // recursive part
    // search node N for an item:
    //     if item is == N's element
    //         return true
    //     if item is < N’s element
    //         if N has a left child, then search N's left child
    //         if N has no left child, then return false
    //     if item is > N’s element
    //         if N has a right child, then search N's right child
    //         if N has no right child, then return false
    private boolean contains(BTNode<String> node, String element) {
        int comparison = element.compareTo(node.data);
        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            // left branch
            // TODO: (recursive case) if node.left isn't null, then return contains(node.left, element)
            // TODO: (base case) if node.left is null, then return false
        } else {
            // right branch
            // TODO: similar to left branch
        }
    }

    public void inorder(LinkedList<String> list) {
        inorder(root, list);
    }

    private void inorder(BTNode<String> node, LinkedList<String> list) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            // TODO: instead of printing the node's data, add it to the list
            inorder(node.right);
        }
    }

    public void preorder() {
        // TODO
    }

    public void postorder() {
        // TODO
    }
}
// how we'd start if we were using a comparator to make our BST generic
// private BTNode<E> root;
// private Comparator<E> comparator;
//
// public BST(Comparator<E> comp) {
//     comparator = comp;
// }
