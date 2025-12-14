package com.aditya.basic_maths;

import java.util.Scanner;

public class ReverseANumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        while (n>0){
            int lastdigit = n%10;
            n = n/10;
            num = (num * 10) + lastdigit;
        }
        System.out.println(num);
    }
}
