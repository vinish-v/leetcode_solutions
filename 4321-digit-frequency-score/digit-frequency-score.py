class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        res =0
        while n>0:
            digit = n%10
            res+=digit
            n=n//10
        return res