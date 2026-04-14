public class BTNodeTest {
    public static void main(String[] args) {
        BTNode<String> root = new BTNode<>("D");

        // TODO: without creating any more variables, build the tree below:
        //
        //      D
        //     / \
        //    /   \
        //   A     C
        //  / \     \
        // B   F     G
        //    /
        //   E
        //

        // TODO: print each node's data without making additional variables
        // for example, to print B:
        System.out.println(root.left.left.data);
    }
}
