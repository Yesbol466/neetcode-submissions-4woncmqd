class Solution:
    def missingNumber(self, arr: List[int]) -> int:
        n = len(arr)
        res = 0
        l , r = 0, n-1
        d= (arr[n-1] - arr[0]) // n
        while l < r:
            mid = (l+r) // 2
            if arr[mid] == arr[0] + mid * d:
                l = mid + 1
            else:
                r = mid
        return arr[0] + d * l


            
        