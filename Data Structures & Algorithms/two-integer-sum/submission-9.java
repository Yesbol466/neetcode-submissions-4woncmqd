class Solution {
    HashMap<Integer, Integer> hash;

    public int[] twoSum(int[] nums, int target) {
        hash = new HashMap<Integer, Integer>();
        int a;

        for(int i = 0; i<nums.length; i++){

            int number = nums[i]; 

            int diff = target - number;

            if(hash.containsKey(diff)){
                return new int[] {hash.get(diff), i};
            }

            hash.put(number, i);
        }

        return new int[] {};
    }
}
