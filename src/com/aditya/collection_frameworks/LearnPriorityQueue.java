package com.aditya.collection_frameworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    static void main() {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(9);
        pq.offer(7);
        pq.offer(90);

        System.out.println(pq);
        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
