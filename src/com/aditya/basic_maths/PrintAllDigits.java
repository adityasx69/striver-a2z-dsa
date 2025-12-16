package com.aditya.basic_maths;

import java.util.Scanner;

public class PrintAllDigits {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n>0){
            int lastDigit = n % 10;
            System.out.println("Digits in reverse order: " + lastDigit);
            n = n/10;
        }
    }
}
