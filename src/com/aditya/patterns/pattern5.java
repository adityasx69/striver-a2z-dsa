package com.aditya.patterns;

import java.util.Scanner;

public class pattern5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}