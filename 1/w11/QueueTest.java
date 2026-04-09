public class QueueTest {
    public static void main(String[] args) {
        ArrayQueue<String> aq = new ArrayQueue<>();

        // we want our data array in the following state:
        //
        // index:    E F G _ _ _ A B C D
        // element:  0 1 2 3 4 5 6 7 8 9
        // front = 6
        // back = 3
        // size = 7

        // move front index towards end of queue
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

        // queue should be in correct state
        // test the print method

        aq.printQueue();
    }
}
