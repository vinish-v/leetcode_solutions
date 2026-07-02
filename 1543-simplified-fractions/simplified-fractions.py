class Solution:
    def simplifiedFractions(self, n: int) -> List[str]:
        visited =[]
        result =[]
        for i in range(1,n+1):
            for j in range(i+1,n+1):
                if i/j not in visited:
                    visited.append(i/j)
                    result.append(str(i)+"/"+str(j))
        return result