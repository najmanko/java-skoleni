package ada.course.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(2);

        System.out.println(queue.poll()); //1
        System.out.println(queue.poll()); //2
        System.out.println(queue.poll()); //3
        System.out.println(queue.poll()); //4
    }
}
