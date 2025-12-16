package com.aditya.patterns;

import java.util.Scanner;

public class pattern7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
    }
}}