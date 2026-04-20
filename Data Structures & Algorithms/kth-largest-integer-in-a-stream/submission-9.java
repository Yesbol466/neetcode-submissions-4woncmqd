class KthLargest {

    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new  PriorityQueue<Integer>();

        for(int i : nums){
            heap.offer(i);

            if(heap.size() > k) {
                heap.poll();
            }
        }
        
    }
    
    public int add(int val) {

        heap.offer(val);
        
        if(heap.size() > k){
            heap.poll();
        }

        return heap.peek();
    }
}
