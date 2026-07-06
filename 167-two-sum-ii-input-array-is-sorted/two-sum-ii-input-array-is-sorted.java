class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left =0;
        int right = n-1;
        while(left < right){
            int tot = numbers[left]+numbers[right];
            if(tot == target){
                return new int []{left+1,right+1};
            }
            if(target > tot ){
                left++;
            }
            else if (target< tot){
                right--;
            }
        }
        return new int []{-1,-1};
    }
}