public class NodeTest {
    // create a node chain that looks like this:
    //
    // first
    //   \
    //    -> [A | ]--> [B | ]--> [C | ]--> null
    //
    public static void main(String[] args) {
        // build from front to back
        Node<String> firstA = new Node<>("A");
        //
        // firstA
        //   \
        //    -> [A | ]--> null
        //
        firstA.next = new Node<>("B");
        //
        // firstA
        //   \
        //    -> [A | ]--> [B | ]--> null
        //
        firstA.next.next = new Node<>("C");
        //
        // firstA
        //   \
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //

        // build from back to front
        Node<String> firstB = new Node<>("C");
        //
        // firstB
        //   \
        //    -> [C | ]--> null
        //
        firstB = new Node<>("B", firstB);
        // not all that different from writing: x = x + 2;
        //
        // firstB
        //   \
        //    -> [B | ]--> [C | ]--> null
        //
        firstB = new Node<>("A", firstB);
        //
        // firstB
        //   \
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //

        // print each chain
        printNodes(firstA);
        printNodes(firstB);

        // remove middle node from the first chain
        firstA.next = firstA.next.next;
        //
        // firstA
        //   \
        //    -> [A | ]--> [C | ]--> null
        //                  ^
        //                  |
        //       [B | ]-----
        //

        // print each chain
        printNodes(firstA);
        printNodes(firstB);
    }

    static void printNodes(Node<String> first) {
        Node<String> n = first;
        while (n != null) {
            System.out.print(n.data + ", ");
            n = n.next;
        }
        //
        // setup
        //
        // first  n
        //   |    |
        //   \    v
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //
        // iteration #1 happens
        //
        // first            n
        //   |              |
        //   \              v
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //
        // iteration #2 happens
        //
        // first                      n
        //   |                        |
        //   \                        v
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //
        // iteration #3 happens
        //
        // first                                n
        //   |                                  |
        //   \                                  v
        //    -> [A | ]--> [B | ]--> [C | ]--> null
        //
        // loop terminates
        //
        System.out.println();
    }
}
