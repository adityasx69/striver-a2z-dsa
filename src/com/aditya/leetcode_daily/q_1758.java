// 1st way

class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();

        int n = arr.length;
        int count = 0;
        for (int i=0;i<n-1;i++){
            if((arr[i] == '0' && arr[i+1] == '1' && arr[i+2] == '0') || arr[i] == '1' && arr[i+1] == '0' && arr[i+2] == '1'){

            }
            else if (arr[i] == '0' && arr[i+1] == '0'){
                arr[i+1] = '1';
                count++;
            }
            else if(arr[i] == '1' && arr[i+1] == '1'){
                arr[i+1] = '0';
                count++;
            }
        }
        return count;
    }
}

// 2nd way

class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int count = 0;

        for (int i=n;i>1;i--){
            if ((arr[i] == '0' && arr[i-1] == '1') || (arr[i] == '1' && arr[i-1] == '0')){

            }
            else if(arr[i] == '0' && arr[i-1] == '0'){
                arr[i] = '1';
                count++;
            }
            else if(arr[i] == '1' && arr[i-1] == '1'){
                arr[i] = '0';
                count++;
            }
        }
        return count;
    }
}

// 3rd way

class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int count = 0;

        for (int i=0;i<n-1;i++){
            if (n>3 && (arr[i]=='1' && arr[i+1]=='0')){
                arr[i+2] = '1';
                count++;
                i=i+2;
            }
            else if(n>3 && (arr[i]=='1' && arr[i+1]=='1')){
                arr[i+1]='0';
                arr[i+2]='1';
                count++;
                i=i+2;
            }
            else if(n>3 && (arr[i]=='0' && arr[i+1]=='0')){
                arr[i+1]='1';
                arr[i+2]='0';
                count++;
                i=i+2;
            }
            else if(count<3 && (arr[i]=='1' && arr[i+1]=='1')){
                arr[i+1] = '0';
                count++;
            }
            else if(count<3 && (arr[i]=='0' && arr[i+1]=='0')){
                arr[i+1] = '1';
                count++;
            }
        }
        return count;
    }
}