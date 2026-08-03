class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total =0;
        int currMax = 0;
        int Max = nums[0];
        int currMin = 0;
        int Min =nums[0];

        for(int num: nums){
            total+=num;
            currMax = Math.max(num,num+currMax);
            Max =Math.max(Max,currMax);
            currMin = Math.min(num,num+currMin);
            Min = Math.min(Min,currMin);
        }
        if(Max<0){
            return Max;
        }

        return Math.max(Max,total-Min);
    }
}