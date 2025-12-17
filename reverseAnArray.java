package com.aditya.basic_recursion;

import java.util.Scanner;

class reverse{
    int i = 0;
    void reverse(int[] arr, int i, int n){
        if (i>=n){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        reverse(arr, i+1,n-1);
    }
}

public class reverseAnArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of elements in an array: " );
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before Reversing: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        reverse obj = new reverse();
        obj.reverse(arr, 0 , size-1);

        System.out.println("After Swapping: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
