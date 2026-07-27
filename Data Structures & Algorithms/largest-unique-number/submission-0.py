class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:
        frequency_map = {}
        for num in nums:
            frequency_map[num]=  frequency_map.get(num,0) + 1
        
        sorted_map = OrderedDict(sorted(frequency_map.items(), reverse = True))
        for num, freq in sorted_map.items():
            if freq == 1 :
                return num

        return -1

        