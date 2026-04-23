public class BSTTest {
    // to test this:
    //
    // java BSTTest.java D A C B F G E
    //
    // should print A B C D E F G in order
    public static void main(String[] args) {
        // fill the tree with our program args
        BST tree = new BST();
        for (String arg : args ) {
            tree.insert(arg);
        }

        // inorder traversal should create a sorted list
        LinkedList<String> list = new LinkedList<>();
        tree.inorder(list);

        // print the list, should be sorted
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
