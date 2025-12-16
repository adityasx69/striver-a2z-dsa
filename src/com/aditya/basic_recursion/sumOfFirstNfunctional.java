package com.aditya.basic_recursion;

import java.util.Scanner;

class sum1{
    public int sum1(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + sum1(n-1);
        }
    }
}

public class sumOfFirstNfunctional {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        sum1 obj = new sum1();
        int sum = obj.sum1(n);
        System.out.println(sum);
    }
}
