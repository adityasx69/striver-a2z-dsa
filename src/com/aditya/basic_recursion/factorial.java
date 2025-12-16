package com.aditya.basic_recursion;

import java.util.Scanner;

class fact{
    public int fact(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}

public class factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        fact obj = new fact();
        int sum = obj.fact(n);
        System.out.println(sum);
    }
}
