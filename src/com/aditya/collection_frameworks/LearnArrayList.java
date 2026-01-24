package com.aditya.collection_frameworks;

import java.util.*;

public class LearnArrayList {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(2,500);
        System.out.println(list);

        System.out.println(list.get(2));

        List<Integer> newlist = new ArrayList<>();
        newlist.add(400);
        newlist.add(4500);

        list.addAll(newlist);
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(400));
        System.out.println(list);

        for (int i=0; i<list.size();i++){
            System.out.println("the element is: " + list.get(i));
        }

        System.out.println();

        for (Integer element:list){
            System.out.println("the element is: " + element);
        }
    }
}
