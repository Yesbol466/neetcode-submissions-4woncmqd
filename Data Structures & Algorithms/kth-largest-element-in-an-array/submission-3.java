class Solution {

    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public int findKthLargest(int[] nums, int k) {
        for(int i : nums){
            heap.offer(i);

            if(heap.size() == k+1){
                heap.poll();
            }
        }

        return heap.peek();
    }
}
