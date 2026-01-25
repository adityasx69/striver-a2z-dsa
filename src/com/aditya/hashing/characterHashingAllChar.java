package com.aditya.hashing;

import java.util.Scanner;

public class characterHashingAllChar {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] hash = new int[256];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        char c = scanner.next().charAt(0);
        System.out.println(hash[c]);
    }
}
