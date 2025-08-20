package PriorityQueues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args){

        Queue<Double> queue = new LinkedList<>();

        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        Queue<String> queue3 = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        queue3.offer("B");
        queue3.offer("C");
        queue3.offer("A");
        queue3.offer("F");
        queue3.offer("D");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        while (!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }

        while (!queue3.isEmpty()){
            System.out.println(queue3.poll());
        }
    }
}
