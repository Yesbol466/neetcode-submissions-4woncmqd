class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for(int i : piles){
            max = i > max ? i : max;
        }

        int left = 1;
        int right = max;
        int result = max;

        while(left <= right){
            int k = (left+right)/2;

            int totalHours = 0;

            for(int i : piles){
                totalHours += Math.ceil((double) i / k);
            }

            if(totalHours <= h){
                right = k - 1;
                result = k;
            } else if (totalHours > h){
                left = k + 1;
            }
        }

        return result;
    }
}
