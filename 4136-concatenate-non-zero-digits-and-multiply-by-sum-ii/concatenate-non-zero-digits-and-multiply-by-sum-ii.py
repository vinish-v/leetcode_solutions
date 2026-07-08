class Solution:
    def sumAndMultiply(self, s: str, queries: list[list[int]]) -> list[int]:
        MOD = 10**9 + 7
        n = len(s)
        
        # prefix_sum[i] stores the sum of digits up to index i-1
        prefix_sum = [0] * (n + 1)
        # prefix_val[i] stores the rolling integer value of non-zero digits up to index i-1
        prefix_val = [0] * (n + 1)
        # nz_count[i] stores the total count of non-zero digits up to index i-1
        nz_count = [0] * (n + 1)
        
        # Precompute powers of 10 modulo MOD
        pow10 = [1] * (n + 1)
        for i in range(1, n + 1):
            pow10[i] = (pow10[i - 1] * 10) % MOD
            
        # Build prefix structures in O(M) time
        for i in range(n):
            digit = int(s[i])
            
            prefix_sum[i + 1] = prefix_sum[i] + digit
            
            if digit != 0:
                prefix_val[i + 1] = (prefix_val[i] * 10 + digit) % MOD
                nz_count[i + 1] = nz_count[i] + 1
            else:
                prefix_val[i + 1] = prefix_val[i]
                nz_count[i + 1] = nz_count[i]
                
        res = []
        # Answer each query in O(1) time
        for l, r in queries:
            # 1. Get the sum of digits in the range [l, r]
            total_sum = prefix_sum[r + 1] - prefix_sum[l]
            
            # 2. Extract the concatenated non-zero integer value in the range [l, r]
            num_nz_in_range = nz_count[r + 1] - nz_count[l]
            
            # Mathematically slice the rolling hash sequence
            concat_val = (prefix_val[r + 1] - prefix_val[l] * pow10[num_nz_in_range]) % MOD
            
            # Calculate final answer for the query
            ans = (concat_val * total_sum) % MOD
            res.append(ans)
            
        return res