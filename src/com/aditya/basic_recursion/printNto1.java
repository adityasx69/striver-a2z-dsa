package com.aditya.basic_recursion;

import java.util.Scanner;

class funct{
    void function(int i,int n){
        if (i ==0 ){
            return;
        }
        else{
            System.out.println(i);
            function(i-1,n);
        }
    }
}

public class printNto1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        funct obj = new funct();
        obj.function(n,n);
    }
}
