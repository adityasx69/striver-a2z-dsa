package com.aditya.basic_maths;

import java.util.Scanner;

class isPalindome{
    public boolean isPalindrome(int n){
        int temp = n;
        int num = 0;
        while (n>0){
            int lastdigit = n%10;
            n = n/10;
            num = (num * 10) + lastdigit;
        }

        if (temp == num){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Palindrome {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        isPalindome obj = new isPalindome();
        boolean isPali = obj.isPalindrome(n);
        System.out.println(isPali);
    }
}
