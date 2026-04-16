public class BTNodeTest {
    public static void main(String[] args) {
        BTNode<String> root1 = makeTree1();
        BTNode<String> root2 = makeTree2();

        printTree(root1);
        printTree(root2);
    }


    // methods to create the following tree
    //      D
    //     / \
    //    /   \
    //   A     C
    //  / \     \
    // B   F     G
    //    /
    //   E

    // one node at a time
    static BTNode<String> makeTree1() {
        BTNode<String> root = new BTNode<>("D");
        root.left = new BTNode<>("A");
        root.right = new BTNode<>("C");
        root.left.left = new BTNode<>("B");
        root.left.right = new BTNode<>("F");
        root.right.right = new BTNode<>("G");
        root.left.right.left = new BTNode<>("E");
        return root;
    }

    static BTNode<String> makeTree2() {
        return new BTNode<>(
            "D",
            new BTNode<>(
                "A",
                new BTNode<>("B"),
                new BTNode<>(
                    "F",
                    new BTNode<>("E"),
                    null
                )
            ),
            new BTNode<>(
                "C",
                null,
                new BTNode<>("G")
            )
        );
    }

    // print the strings in alphabetical order using their known positions in
    // the tree picture above
    static void printTree(BTNode<String> root) {
        System.out.print(root.left.data);           // A
        System.out.print(root.left.left.data);      // B
        System.out.print(root.right.data);          // C
        System.out.print(root.data);                // D
        System.out.print(root.left.right.left.data);// E
        System.out.print(root.left.right.data);     // F
        System.out.print(root.right.right.data);    // G
        System.out.println();
    }
}
