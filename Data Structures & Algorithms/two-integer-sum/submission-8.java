class Solution {
    HashMap<Integer, Integer> hash;

    public int[] twoSum(int[] nums, int target) {
        hash = new HashMap<Integer, Integer>();
        int a;

        for(int i = 0; i<nums.length; i++){

            if(hash.containsKey(nums[i])){
                return new int[] {hash.get(nums[i]), i};
            }

            a = target - nums[i];
            hash.put(a, i);
        }

        return new int[] {};
    }
}
