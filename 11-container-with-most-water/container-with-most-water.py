class Solution:
    def maxArea(self, height: List[int]) -> int:
        left =0
        right = len(height)-1
        maxlen=0
        while left < right:
            width = right - left 
            maxlen = max(maxlen,width *min(height[right],height[left]))
            if height[left] < height[right]:
                left+=1
            else:
                right -=1
        return maxlen
