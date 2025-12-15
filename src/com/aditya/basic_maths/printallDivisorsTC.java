package com.aditya.basic_maths;

import java.util.*;

class divisor1{
    public void divisor1(int n){
        List<Integer> divisors = new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                divisors.add(i);
                if ((n / i) != i) {
                    divisors.add(n / i);
                }
            }
        }
            Collections.sort(divisors);
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}

public class printallDivisorsTC {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        divisor1 obj = new divisor1();
        obj.divisor1(n);
    }
}
