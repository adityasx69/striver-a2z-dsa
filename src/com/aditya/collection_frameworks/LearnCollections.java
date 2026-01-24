package com.aditya.collection_frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollections {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(56);
        list.add(12);
        list.add(46);
        list.add(7);
        list.add(78);
        list.add(12);
        list.add(23);
        list.add(65);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,23));

        Collections.sort(list);
        System.out.println(list);
    }
}
