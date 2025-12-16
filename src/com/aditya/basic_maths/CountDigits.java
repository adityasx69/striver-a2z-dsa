package com.aditya.basic_maths;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n>0){
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
