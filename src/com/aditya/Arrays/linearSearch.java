package com.aditya.Arrays;

import java.util.Scanner;

public class linearSearch {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values in the array: ");
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The values of the array are: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the value to be found: ");
        int key = scanner.nextInt();
        int found = 0;
        for (int i=0;i<n;i++){
            if (arr[i] == key){
                System.out.println("Element found at position " + (i+1));
                found = 1;
            }
        }
        if (found == 1){
            System.out.println("Element not found!");
        }
    }
}
