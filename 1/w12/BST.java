public class BST {
    private BTNode<String> root;

    public BST() {
        root = null;
    }

    // nonrecursive part:
    // if root is empty, create root node with new item
    // if root is not empty, attempt to insert as a child of root

    // public method, handle empty tree case
    public void insert(String element) {
        if (root == null) {
            root = new BTNode<>(element);
        } else {
            insert(root, element);
        }
    }

    // recursive part:
    // to insert as a child of node N:
    //     if new item is <= N’s element
    //         if N has a left child, then attempt to insert as a child of N’s left child
    //         if N has no left child, then create a left child with new item
    //     if new item is > N’s element
    //         if N has a right child, then attempt to insert as a child of N’s right child
    //         if N has no right child, then create a right child with new item

    // recursive method, handle all other cases
    private void insert(BTNode<String> node, String element) {
        // TODO: compare strings properly
        // element.compareTo(node.data)...
        if (element <= node.data) { // <= can't be used for strings!
            if (node.left != null) {
                // recursive case, have to insert below node.left
                insert(node.left, element);
            } else {
                // base case, create node.left
                node.left = new BTNode<>(element);
            }
        } else {
            // TODO: same as left side, but for the right side
        }
    }

    // nonrecursive part:
    // if root is empty, return false
    // if root is not empty, search root

    public boolean contains(String element) {
        // TODO: handle root empty or call recursive contains
    }

    // recursive part:
    // to search for item in node N:
    //     if item is == N's element
    //         return true
    //     if item is < N’s element
    //         if N has a left child, then search N's left child
    //         if N has no left child, then return false
    //     if item is > N’s element
    //         if N has a right child, then search N's right child
    //         if N has no right child, then return false

    private boolean contains(BTNode<String> node, String element) {
        // save comparison so we don't have to call compareTo twice
        int comparison = element.compareTo(node.data);
        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            // TODO: (recursive case) if node.left isn't null, return contains(node.left)
            // TODO: (base case) if node.left is null, return false
        } else {
            // TODO: same as left, but for the right side
        }
    }

    public void inorder(LinkedList<String> list) {
        inorder(root, list);
    }

    private void inorder(BTNode<String> node, LinkedList<String> list) {
        if (node != null) {
            inorder(node.left);
            // TODO: try adding data to the list instead of printing it
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void preorder() {
        // TODO: implement preorder using inorder as a reference
    }

    public void postorder() {
        // TODO: implement postorder using inorder as a reference
    }
}
