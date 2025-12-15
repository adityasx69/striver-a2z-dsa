package com.aditya.basic_recursion;

import java.util.Scanner;

class func{
    int i = 1;
    void function(int i,int n){
        if (i > n){
            return;
        }
        else{
            System.out.println(i);
            function(i+1,n);
        }
    }
}

public class print1toN {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        func obj = new func();
        obj.function(1,n);
    }
}
