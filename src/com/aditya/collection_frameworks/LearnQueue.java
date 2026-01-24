package com.aditya.collection_frameworks;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
