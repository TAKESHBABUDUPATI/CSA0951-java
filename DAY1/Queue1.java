import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Customer1");
        queue.offer("Customer2");
        queue.offer("Customer3");
        System.out.println("Front element: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.poll());
        }
    }
}
