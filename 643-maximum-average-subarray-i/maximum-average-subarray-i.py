class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        firstsum = 0
        for i in range(k):
            firstsum+=nums[i]
        maxavg = firstsum
        for i in range(k,len(nums)):
            firstsum+=nums[i]
            firstsum-=nums[i-k]
            maxavg = max(maxavg,firstsum)
        return maxavg/k