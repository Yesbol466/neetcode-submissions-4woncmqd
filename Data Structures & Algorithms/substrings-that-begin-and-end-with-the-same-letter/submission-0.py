class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        counts = [0] * 26
        answer = 0
        for c in s:
            index = ord(c) - ord('a')
            counts[index] += 1
            answer += counts[index]
        return answer
