public class NodeTest {
    public static void main(String[] args) {
        // create this chain of nodes
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //

        // build from front to back
        Node<String> firstA = new Node<>("A");
        //
        // first
        //   \
        //    --> [A | null]
        //
        firstA.next = new Node<>("B");
        //
        // first
        //   \
        //    --> [A | ]--> [B | null]
        //
        firstA.next.next = new Node<>("C");
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //

        // build from back to front
        Node<String> firstB = new Node<>("C");
        //
        // first
        //   \
        //    --> [C | null]
        //
        firstB = new Node<>("B", firstB);
        //
        // first
        //   \
        //    --> [B | ]--> [C | null]
        //
        firstB = new Node<>("A", firstB);
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //

        // print both chains
        // print second node's data
        // System.out.println(firstA.next.data.toLowerCase());
        printNodes(firstA);
        printNodes(firstB);

        // delete middle node from one chain

        // first node points to the node after its next node
        firstA.next = firstA.next.next;

        // print both chains again to show the removal
        printNodes(firstA);
        printNodes(firstB);
    }

    static void printNodes(Node<String> first) {
        // will not work for a circular chain of nodes
        Node<String> n = first;
        while (n != null) {
            System.out.print(n.data + ", ");
            n = n.next;
        }
        //
        // setup
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //         ^
        //         |
        // n-------
        //
        // iteration #1
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //                   ^
        //                   |
        // n-----------------
        //
        // iteration #2
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //                             ^
        //                             |
        // n---------------------------
        //
        // iteration #3
        //
        // first
        //   \
        //    --> [A | ]--> [B | ]--> [C | null]
        //
        // n = null
        //
        // loop terminates
        //
        System.out.println();
    }
}
