package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("Kevin",23));
        queue.add(new Person("Sevin",15));
        queue.add(new Person("Devin",43));
        queue.add(new Person("Gelin",19));

        while (queue.peek() != null){
            System.out.println(queue.poll());
        }
    }
}
