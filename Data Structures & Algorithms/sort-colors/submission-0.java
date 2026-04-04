class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];

        for(int i : nums){
            counts[i] += 1;
        }

        int a = 0;
        for(int i = 0; i<counts.length; i++){ //max = 2 in our case
            for(int j = counts[i]; j != 0; j--){
                nums[a] = i;
                a++;
            }
        }
    }
}