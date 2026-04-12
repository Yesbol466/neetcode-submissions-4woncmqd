class Solution {
    List<List<Integer>> lists= new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sublist = new ArrayList<>();

        dfs(nums, 0, sublist, lists);
        return lists;

    }

    void dfs(int[] nums, int index, List<Integer> sublist, List<List<Integer>> lists){
        if(index >= nums.length){
            lists.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[index]);

        dfs(nums, index + 1, sublist, lists);
        sublist.remove(sublist.size() - 1);
        dfs(nums, index + 1, sublist, lists);
    }
    
}
