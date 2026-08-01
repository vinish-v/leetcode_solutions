class Solution {
    public boolean predictTheWinner(int[] nums) {
        int left =0;
        int right =nums.length-1;
        int scoreDiff = getDiff(nums,left, right);
        return scoreDiff>=0;
    }
    private int getDiff(int[] nums, int left , int right){
        if(left == right){
            return nums[left];
        }
        int leftPick = nums[left] - getDiff(nums, left+1,right);
        int rightPick = nums[right]- getDiff(nums,left,right-1);
        return Math.max(leftPick,rightPick);
    }
}