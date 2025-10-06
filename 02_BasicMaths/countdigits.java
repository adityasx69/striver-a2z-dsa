class Solution {
    static int countDigits(int n){
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n/10;
        }
        return count;
    }
}

public class countdigits{
    public static void main(String[] args){
        int n = 7789;
        int countofDigits = Solution.countDigits(n);
        System.out.println(countofDigits);
    }
}