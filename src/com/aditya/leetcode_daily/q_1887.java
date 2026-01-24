package com.aditya.leetcode_daily;

import java.util.*;

class Solution {
    public int minPairSum(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int[] max = new int[size];
        for (int i=0;i<size;i++){
            max[i] = (nums[i] + nums[size-1]);
            i++;
            size--;
        }
        List<Integer> list = Arrays.asList(size);
        int max1 = Collections.max(list);
        return max1;
    }
}

public class q_1887 {
    public static void main(String[] args){

        int[] arr = {3,5,2,3};
        Solution soln = new Solution();
        soln.minPairSum(arr);
    }
}