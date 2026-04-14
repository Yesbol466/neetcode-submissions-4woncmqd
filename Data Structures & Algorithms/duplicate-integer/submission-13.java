class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();

        boolean hasDuplicate = false;

        for(int i : nums){
            if(table.containsKey(i)) {
                hasDuplicate = true;
            } else table.put(i, 1);
        }

        return hasDuplicate;
    }
}