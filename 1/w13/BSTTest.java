public class BSTTest {
    // test this by running
    // java BSTTest.java D A C B F G E
    //
    // it should print the letters in alphabetical order
    public static void main(String[] args) {
        BST tree = new BST();

        // build tree
        for (String arg : args) {
            tree.insert(arg);
        }

        // perform traversal, adding elements to list in sorted order
        LinkedList<String> list = new LinkedList<>();
        tree.inorder(list);

        // print the list to see if it's in order
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
