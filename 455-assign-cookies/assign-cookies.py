class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        i =0
        j=0
        m = len(g)
        n = len(s)
        count =0
        while i < m and j < n :
            if g[i] <=s[j]:
                count+=1
                i+=1
                j+=1
            elif g[i] > s[j]:
                j+=1
            
        return count

