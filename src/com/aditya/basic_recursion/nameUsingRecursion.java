package com.aditya.basic_recursion;

import java.util.Scanner;

class name{
    int i = 1;
    void function(int i,int n){
        if (i > n){
            return;
        }
        else{
            System.out.println("Aditya");
            function(i+1,n);
        }
    }
}

public class nameUsingRecursion{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        name obj = new name();
        obj.function(1,n);
    }
}
