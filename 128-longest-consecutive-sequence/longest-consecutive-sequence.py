class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        nums.sort()
        long_streak = 1
        curr_streak =1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                continue
            if nums[i] == nums[i-1]+1:
                curr_streak+=1
            else:
                long_streak = max(long_streak,curr_streak)
                curr_streak =1
        return max(long_streak,curr_streak)