class largestInArray {
    public static int largestInArray(int[] arr) {
        // code here
        int largest = 0;
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i+1] > arr[i]){
                largest = i+1;
            }
        }
        return arr[largest];
    }
}

// brute force
//int max = arr[0];
//        for (int i=1;i<arr.length;i++){
//        if (arr[i] > max){
//max = arr[i];
//        }
//        }
//        return max;