class KthLargest {

    List<Integer> heap = new ArrayList<>();
    int K;

    public KthLargest(int k, int[] nums) {

        K = k;

        for(int i : nums){
            heap.add(i);
        }

        Collections.sort(heap);
    }
    
    public int add(int val) {
        heap.add(val);
        Collections.sort(heap);

        return heap.get(heap.size() - K);

    }
}
