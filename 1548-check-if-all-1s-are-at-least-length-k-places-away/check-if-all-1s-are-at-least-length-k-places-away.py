class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        prev =0
        if nums[0] ==0:
            for i in range(1,len(nums)):
                if nums[i]==1:
                    prev = i
                    break
        for i in range(prev + 1, len(nums)):
            if nums[i] == 1:
                if i - prev - 1 < k: 
                    return False
                prev = i
        return True
    
            

        

                