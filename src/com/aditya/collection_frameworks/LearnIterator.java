package com.aditya.collection_frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
