public class BTNodeTest {
    // For an example with our regular nodes, check NodeTest from w10
    public static void main(String[] args) {
        BTNode<String> root1 = makeTree1();
        BTNode<String> root2 = makeTree2();

        printTree(root1);
        printTree(root2);
    }

    //      D
    //     / \
    //    /   \
    //   A     C
    //  / \     \
    // B   F     G
    //    /
    //   E
    //
    // methods for creating the above tree

    static BTNode<String> makeTree1() {
        // top layer
        BTNode<String> root = new BTNode<>("D");

        // second layer
        root.left = new BTNode<>("A");
        root.right = new BTNode<>("C");

        // third layer
        root.left.left = new BTNode<>("B");
        root.left.right = new BTNode<>("F");
        root.right.right = new BTNode<>("G");

        // fourth layer
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

    // method for printing tree's data alphabetically
    static void printTree(BTNode<String> root) {
        System.out.print(root.left.data);
        System.out.print(root.left.left.data);
        System.out.print(root.right.data);
        System.out.print(root.data);
        System.out.print(root.left.right.left.data);
        System.out.print(root.left.right.data);
        System.out.print(root.right.right.data);
        System.out.println();
    }
}
