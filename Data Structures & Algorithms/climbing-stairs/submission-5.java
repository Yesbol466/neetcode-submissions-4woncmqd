class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;

        int res = 0;
        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++){
            res = first + second;

            first = second;
            second = res;
        }

        return res;
    }
}
