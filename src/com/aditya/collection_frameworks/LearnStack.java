package com.aditya.collection_frameworks;

import java.util.Stack;

public class LearnStack {
    static void main() {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Tiger");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals);
    }
}
