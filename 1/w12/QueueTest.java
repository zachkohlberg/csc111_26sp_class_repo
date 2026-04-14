public class QueueTest {
    public static void main(String[] args) {
        // ArrayQueue<String> queue = new ArrayQueue<>();
        LinkedQueue<String> queue = new LinkedQueue<>();

        // we want our data array in the following state:
        //
        // index:    E F G _ _ _ A B C D
        // element:  0 1 2 3 4 5 6 7 8 9
        // front = 6
        // back = 3
        // size = 7

        // move front index towards end of queue
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
        queue.enqueue("H");
        queue.enqueue("I");
        queue.enqueue("J");
        queue.enqueue("K");

        // queue should be in correct state
        // test the print method

        queue.printQueue();
    }
}
