package com.aditya.hashing;

import java.util.Scanner;

public class basic {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        int[] hash = new int[100];
        for (int i=0;i<n;i++){
            hash[array[i]]++;
        }
        System.out.print("Enter the number: ");
        int q = scanner.nextInt();
        System.out.print("No of occurences: ");
        System.out.println(hash[q]);
    }
}
