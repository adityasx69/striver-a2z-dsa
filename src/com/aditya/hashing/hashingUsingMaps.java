package com.aditya.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashingUsingMaps {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Frequency: " + mpp.getOrDefault(num,0));
    }
}
