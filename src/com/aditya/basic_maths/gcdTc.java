package com.aditya.basic_maths;

import java.util.Scanner;

class gcdtime {
    public static int gcd(int a, int b) {
        int gcd=0;
        for (int i= Math.min(a,b); i>=1 ; i--){
            if (a%i == 0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}

public class gcdTc {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = Solution.gcd(num1,num2);
        System.out.println(gcd);
    }
}