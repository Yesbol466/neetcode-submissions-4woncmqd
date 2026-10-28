class Solution:
    def maximumSumScore(self, nums: List[int]) -> int:
        total = sum(nums)
        prefix = 0
        ans = total
        for value in nums:
            ans = max(ans, total-prefix)
            prefix +=value
            ans = max(ans ,prefix)
        return ans