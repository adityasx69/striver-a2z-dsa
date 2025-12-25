package com.aditya.basic_recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class strPal{
    Boolean strPal(String s, int i, int n){
        if (i >= n/2){
            return true;
        }
        else{
            if (s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
            return strPal(s, i+1, n);
        }
    }
}

class stringPalindrome {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int n = s.length();

        strPal obj = new strPal();
        Boolean pal = obj.strPal(s, 0, n);
        System.out.println(pal);
    }
}
