package com.aditya.basic_maths;

import java.util.Scanner;

class divisor{
    public void divisor(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}

public class printAllDivisors {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        divisor obj = new divisor();
        obj.divisor(n);
    }
}
