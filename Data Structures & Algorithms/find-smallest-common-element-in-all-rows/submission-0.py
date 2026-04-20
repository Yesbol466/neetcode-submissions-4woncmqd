class Solution:
    def smallestCommonElement(self, mat: List[List[int]]) -> int:
        n, m = len(mat), len(mat[0])

        for j in range(m):
            found = True
            i = 1
            while i < n and found:
                found = self.binarySearch(mat[i], mat[0][j]) >= 0
                i += 1

            if found:
                return mat[0][j]

        return -1


    def binarySearch(self, arr, target):
        left, right = 0, len(arr) - 1
        while left <= right:
            mid = (left + right) // 2
            if arr[mid] == target:
                return mid
            elif arr[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return -1