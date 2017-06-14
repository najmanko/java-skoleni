package cz.adastra.collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueSample {

    public static void main(String[] args) {
        System.out.println("Queue");
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(2);

        System.out.println(queue.poll()); //1
        System.out.println(queue.poll()); //2
        System.out.println(queue.poll()); //3
        System.out.println(queue.poll()); //4

        Deque<Integer> deque = new ArrayDeque<>();

        //ZISTIT KDE JE PROBLEM!!!!!!!!!!!!
        System.out.println("Dequeue");
        deque.add(1);
        deque.add(2);
        deque.add(3);

        System.out.println("printing elements in normal order:");
        for(Iterator itr = deque.iterator(); itr.hasNext();)  {
            System.out.println(itr.next());
        }

        System.out.println("printing elements in reverse order:");

        for(Iterator descItr = deque.descendingIterator();descItr.hasNext();) {
            System.out.println(descItr.next());
        }
    }
}
