package com.aditya.basic_maths;

import java.util.Scanner;

class isPrime {
    boolean isPrime(int n) {
        int count = 0;
        for (int i=1; i<=Math.sqrt(n);i++){
            if (n%i ==0){
                count++;
                if ((n/i) != i){
                    count++;
                }
            }
        }
        if (count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}

public class checkPrime {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        isPrime obj1 = new isPrime();
        boolean isPrime = obj1.isPrime(n);
        System.out.println(isPrime);
    }
}
