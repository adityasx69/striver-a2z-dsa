package com.aditya.collection_frameworks;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    static void main() {

        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.offer(23);
        aq.offer(12);
        aq.offer(45);
        aq.offer(26);

        System.out.println(aq);

        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        System.out.println(aq.poll());
        System.out.println(aq);

        System.out.println(aq.pollFirst());
        System.out.println(aq);

        System.out.println(aq.pollLast());
        System.out.println(aq);

    }
}