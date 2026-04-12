class Solution {

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> listOfNumbers = new ArrayList<>();
        dfs(nums,0,listOfNumbers,target,0);
        return lists;
    }

    public void dfs(int[] nums, int index, 
        List<Integer> listOfNumbers, 
        int target, int currentSum){
        
        if(currentSum == target){
            lists.add(new ArrayList<>(listOfNumbers));
            return;
        }

        if(currentSum > target || index >= nums.length){
            return;
        }

        listOfNumbers.add(nums[index]);
        currentSum+=nums[index];
        
        dfs(nums, index, listOfNumbers, target, currentSum);

        listOfNumbers.remove(listOfNumbers.size() - 1);
        currentSum-=nums[index];
        
        dfs(nums, index + 1, listOfNumbers, target, currentSum);
    }
}
