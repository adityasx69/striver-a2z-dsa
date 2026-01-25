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

class sLargest{
    int sLargest(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

public class secondLargest {
    static void main() {
        int num = 5;
        int[] nums = {1,3,6,5,7,3};
            sLargest sl = new sLargest();
            int x = sl.sLargest(nums,num);
        System.out.println(x);
    }
}
