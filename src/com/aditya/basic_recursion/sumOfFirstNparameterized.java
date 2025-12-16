package com.aditya.basic_recursion;

import java.util.Scanner;

class sum{
    int sum = 0;
    public int sum(int i,int n){
        if(i < 1){
            return sum;
        }
        else{
            sum += i;
            sum(i-1,n);
        }
        return sum;
    }
}

public class sumOfFirstN {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        sum obj = new sum();
        int sum = obj.sum(n,n);
        System.out.println(sum);
    }
}
