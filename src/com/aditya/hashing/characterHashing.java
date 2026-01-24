package com.aditya.hashing;

import java.util.Scanner;

public class characterHashing {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] hash = new int[26];
        for (int i=0;i<s.length();i++){
            hash[s[i] - 'a']++;
        }
        char c = scanner.next().charAt(0);
        System.out.println(c - 'a');
    }
}
