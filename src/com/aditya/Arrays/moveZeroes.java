package com.aditya.Arrays;

//class Solution {
//    public void moveZeroes(int[] nums) {
//        int n = nums.length;
//        int count = 0;
//        int[] temp = new int[n];
//        int index=0;
//        for (int i=0;i<n;i++){
//            if (nums[i] == 0 && n>1){
//                temp[count] = nums[i];
//                count++;
//                index = i;
//            }
//            else if(nums[i]!=0 && n>1){
//                nums[index] = nums[i];
//            }
//        }
//
//        for (int i=n-count;i<n;i++){
//            nums[i] = temp[i];
//        }
//    }
//}
//


class moveZeroes{
        public void moveZeroes(int[] nums) {
            int i = 0;

            for(int j=0;j<nums.length;j++){
                if (nums[j]!=0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
            }
        }
    }