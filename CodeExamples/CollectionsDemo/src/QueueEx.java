import java.util.PriorityQueue;

/**
 * Created by Antonella on 4/18/17.
 */
public class QueueEx {

    //
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();

        // add items to the queue
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.println(q);
        System.out.println(q.peek());

        System.out.println();
        // remove item from queue
        q.poll();
        System.out.println(q);


    }
}
