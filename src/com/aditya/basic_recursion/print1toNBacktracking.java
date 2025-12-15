package com.aditya.basic_recursion;

import java.util.Scanner;

class functi{
    int i = 1;
    void function(int i,int n){
        if (i < 1){
            return;
        }
        else{
            function(i-1,n);
            System.out.println(i);
        }
    }
}

public class print1toNBacktracking {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        functi obj = new functi();
        obj.function(n,n);
    }
}
