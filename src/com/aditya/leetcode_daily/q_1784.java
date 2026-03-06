// 1st approach

package com.aditya.leetcode_daily;

public class q_1784 {
        public boolean checkOnesSegment(String s) {
            int n = s.length();
            int count = 0;
            if(s.charAt(0) == '1'){
                for (int i=0;i<n;i++){
                    if (s.charAt(i) == '0'){
                        count++;
                    }
                }
            }
            if (count > 1){
                return false;
            }
            if (count == 1){
                return true;
            }
            return false;
        }
    }

    // 2nd

