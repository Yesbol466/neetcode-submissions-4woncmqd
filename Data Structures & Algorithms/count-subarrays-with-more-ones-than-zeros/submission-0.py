class Solution:
    def subarraysWithMoreOnesThanZeroes(self, nums: List[int]) -> int:
        n = len(nums)
        bit = [0] * (2 * n + 3)
        prefix = n + 1
        answer = 0
        for value in [None] + nums:
            if value is not None:
                prefix += 1 if value else -1
                j = prefix - 1
                while j:
                    answer += bit[j]
                    j -= j & -j
            j = prefix
            while j < len(bit):
                bit[j] += 1
                j += j & -j
        return answer % 1000000007
