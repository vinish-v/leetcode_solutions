class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        sorted_arr = sorted(arr)
        rank_map ={}
        current_rank =1
        for num in sorted_arr:
            if num not in rank_map:
                rank_map[num] = current_rank
                current_rank+=1
        result=[]
        for num in arr:
            result.append(rank_map[num])
        return result

