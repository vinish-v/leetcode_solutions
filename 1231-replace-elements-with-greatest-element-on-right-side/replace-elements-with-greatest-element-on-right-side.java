class Solution {
    public int[] replaceElements(int[] arr) {
        int left =0;
        while(left < arr.length-1){
            int max = arr[left+1];
            int right =left+1;
            while(right < arr.length){
                if(arr[right] > max){
                    max = arr[right];
                }
                right++;
            }
            arr[left] = max;
            left++;
        }
        arr[arr.length-1] =-1;
        return arr;
    }
}