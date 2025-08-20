package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();



        queue.offer("Karen"); // head
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold"); // tail

//        System.out.println(queue.peek());

        queue.poll();

//        System.out.println(queue.isEmpty());

//        System.out.println(queue.size());

        System.out.println(queue.contains("Steve"));

        System.out.println(queue);
    }
}
