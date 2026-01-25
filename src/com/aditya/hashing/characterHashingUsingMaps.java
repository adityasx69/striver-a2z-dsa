package com.aditya.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterHashingUsingMaps {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.next();

        Map<Character, Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.print("Enter the character: ");
        char c = scanner.next().charAt(0);
        System.out.println("Frequency: " + mpp.getOrDefault(c,0));
    }
}
