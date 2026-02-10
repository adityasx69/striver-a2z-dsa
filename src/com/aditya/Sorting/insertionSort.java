package com.aditya.Sorting;

import java.util.Scanner;

public class insertionSort {
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

        for (int i=0;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println();
        System.out.print("Array after sorting: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
