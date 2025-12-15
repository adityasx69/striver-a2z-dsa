package com.aditya.basic_recursion;

import java.util.Scanner;

class f{
    int count = 0;
    void function(int n){
        if (count == n){
            return;
        }
        else{
            count++;
            System.out.println(count);
            function(n);
        }
    }
}

public class recursion {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        f obj = new f();
        obj.function(n);
    }
}
