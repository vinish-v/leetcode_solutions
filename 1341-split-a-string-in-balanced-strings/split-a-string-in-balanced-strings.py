class Solution:
    def balancedStringSplit(self, s: str) -> int:
        n= len(s)
        count=0
        res=0
        i=0
        while i < n:
            if s[i] == 'L':
                count+=1
            else :
                count -=1
            if count == 0:
                res+=1
            i+=1
        return res
            