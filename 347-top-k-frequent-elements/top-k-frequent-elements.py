class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = Counter(nums)
        return[num for num , freq in freq_map.most_common(k) ]