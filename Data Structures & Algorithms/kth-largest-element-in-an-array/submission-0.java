class Solution {

    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public int findKthLargest(int[] nums, int k) {
        for(int i : nums){
            heap.offer(i);
        }

        while(heap.size() != k){
            heap.poll();
        }

        return heap.peek();
    }
}
