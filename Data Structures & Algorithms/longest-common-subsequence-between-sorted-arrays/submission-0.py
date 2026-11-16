class Solution:
    def longestCommonSubsequence(self, arrays: List[List[int]]) -> List[int]:
        counts = [0]*101
        for row in arrays:
            for value in row:
                counts[value] +=1
        return [value for value in range(1, 101) if counts[value] == len(arrays)]

