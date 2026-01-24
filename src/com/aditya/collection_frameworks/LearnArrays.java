package com.aditya.collection_frameworks;

import java.util.Arrays;

public class LearnArrays {
    static void main() {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println(index);
        System.out.println();

        int[] nums = {12,524,5,2,6,7,11,36,85,321};
        Arrays.sort(nums);

        for (int i : nums){
            System.out.println(i);
        }
    }
}
