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
        if (element.compareTo(node.data) <= 0) {
            if (node.left != null) {
                // recursive case, have to insert below node.left
                insert(node.left, element);
            } else {
                // base case, create node.left
                node.left = new BTNode<>(element);
            }
        } else {
            if (node.right != null) {
                // recursive case, have to insert below node.right
                insert(node.right, element);
            } else {
                // base case, create node.right
                node.right = new BTNode<>(element);
            }
        }
    }

    // nonrecursive part:
    // if root is empty, return false
    // if root is not empty, search root

    public boolean contains(String element) {
        if (root == null) {
            return false;
        } else {
            return contains(root, element);
        }
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
            if (node.left != null) {
                // (recursive case) if node.left isn't null, return contains(node.left)
                return contains(node.left, element);
            } else {
                // (base case) if node.left is null, return false
                return false;
            }
        } else {
            if (node.right != null) {
                // (recursive case) if node.right isn't null, return contains(node.right)
                return contains(node.right, element);
            } else {
                // (base case) if node.right is null, return false
                return false;
            }
        }
    }

    public void inorder(LinkedList<String> list) {
        inorder(root, list);
    }

    private void inorder(BTNode<String> node, LinkedList<String> list) {
        if (node != null) {
            inorder(node.left, list);
            // add data to the list instead of printing it
            list.add(node.data);
            inorder(node.right, list);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode<String> node) {
        if (node != null) {
            // visit node first in preorder
            System.out.println(node.data);
            // visit branches after
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder() {
        // TODO: implement postorder using inorder as a reference
    }
}
