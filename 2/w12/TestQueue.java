public class TestQueue {
    public static void main(String[] args) {
        // ArrayQueue<String> queue = new ArrayQueue<>();
        LinkedQueue<String> queue = new LinkedQueue<>();

        //
        // to test printQueue, we want the following state in queue:
        //
        // index:   0 1 2 3 4 5 6 7 8 9
        // element: E F G _ _ _ A B C D
        // front = 6
        // back = 3
        // size = 7
        //

        // move front six spaces forward to set up our queue state
        for (int i = 0; i < 6; i++) {
            queue.enqueue("X");
            queue.dequeue();
        }

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");
        queue.enqueue("G");
        // uncomment these to force the queue to resize
        queue.enqueue("H");
        queue.enqueue("I");
        queue.enqueue("J");
        queue.enqueue("K");

        // now print the queue to see if we iterate over the correct portion of
        // the array in printQueue

        queue.printQueue();
    }
}
