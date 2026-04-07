class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int min = 0;
        int n = piles.length;

        for(int i = n - 1; i>=0; i--){
            if(piles[i] > max) max = piles[i];
        }

        int res = max;

        int right = max;
        int left = 1;

        while(left <= right){
            int totalHour = 0;

            int k = (left + right)/2; //rate

            for(int i : piles) totalHour += Math.ceil((double) i / k);

            if(h >= totalHour){
                res = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
            
        }

        return res;
    }
}
