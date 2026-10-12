class Solution:
    def threeSumSmaller(self, nums: List[int], target: int) -> int:
        nums.sort()
        res = 0
        for i in range(len(nums) -2):
            res += self.twoSumSmaller(nums,i+1,target-nums[i])
        return res
    def twoSumSmaller(self,nums:List[int], startIndex:int, target:int) ->int:
        res = 0
        l,r = startIndex, len(nums) - 1
        while l < r:
            if nums[l] + nums[r] < target:
                res += r-l
                l+=1
            else:
                r-=1
        return res
        