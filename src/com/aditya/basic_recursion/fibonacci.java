package com.aditya.basic_recursion;

import java.util.Scanner;

class fib{
    int fib(int n){
        if (n <= 1){
            return n;
        }
        else{
            int last = fib(n-1);
            int slast = fib(n-2);
            return last+slast;
        }
    }
}

public class fibonacci {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        fib obj = new fib();
        System.out.println(obj.fib(n));
    }
}
