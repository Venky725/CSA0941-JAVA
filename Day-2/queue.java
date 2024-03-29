
import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
