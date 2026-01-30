package com.aditya.Sorting;

import java.util.Scanner;

public class selectionSort {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values of the array: ");

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array before sorting: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        for (int i=0;i<=n-2;i++){
            int min = i;
            for (int j=i;j<=n-1;j++){
                if (arr[j] <  arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("Array after sorting: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
