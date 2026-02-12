//brute force
//class secondLargest {
//    public int secondLargest(int[] arr) {
//        // code here
//        Arrays.sort(arr);
//        int n = arr.length;
//        int largest = arr[n-1];
//        int second_largest = -1;
//        for (int i=n-2;i>=0;i--){
//            if(arr[i]!=largest){
//                second_largest =  arr[i];
//                break;
//            }
//        }
//        return second_largest;
//    }
//}
//
package com.aditya.Arrays;

class Solution {
    public int getSecondLargest(int[] arr,int length) {
        // code here
        int largest = arr[0];
        int slargest = -1;
        for (int i=1;i<length;i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i=0;i<length;i++){
            if (arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}

public class secondLargest {
    static void main() {
        int num = 5;
        int[] nums = {1,3,6,5,7,3};
            Solution sl = new Solution();
            int x = sl.getSecondLargest(nums,num);
        System.out.println(x);
    }
}
