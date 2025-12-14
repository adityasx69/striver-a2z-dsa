package com.aditya.basic_maths;

import java.util.Scanner;

class isArmstrong{
    public boolean isArmstrong(int n){
        int temp = n;
        int armstrong = 0;
        int lastDigit = 0;

        while (n>0){
            lastDigit = n%10;
            armstrong = armstrong + (int) Math.pow(lastDigit , 3);
            n = n/10;
        }
        if (temp == armstrong){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Armstrong {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        isArmstrong obj = new isArmstrong();
        boolean isArm = obj.isArmstrong(n);
        System.out.println(isArm);

    }
}
