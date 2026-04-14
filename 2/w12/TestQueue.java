public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<String> aq = new ArrayQueue<>();

        //
        // to test printQueue, we want the following state in aq:
        //
        // index:   0 1 2 3 4 5 6 7 8 9
        // element: E F G _ _ _ A B C D
        // front = 6
        // back = 3
        // size = 7
        //

        // move front six spaces forward to set up our queue state
        for (int i = 0; i < 6; i++) {
            aq.enqueue("X");
            aq.dequeue();
        }

        aq.enqueue("A");
        aq.enqueue("B");
        aq.enqueue("C");
        aq.enqueue("D");
        aq.enqueue("E");
        aq.enqueue("F");
        aq.enqueue("G");
        // uncomment these to force the queue to resize
        aq.enqueue("H");
        aq.enqueue("I");
        aq.enqueue("J");
        aq.enqueue("K");

        // now print the queue to see if we iterate over the correct portion of
        // the array in printQueue

        aq.printQueue();
    }
}
