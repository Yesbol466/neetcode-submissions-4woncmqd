class KthLargest {

    List<Integer> heap = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {

        this.k = k;

        for(int i : nums){
            heap.add(i);
        }

        Collections.sort(heap);
    }
    
    public int add(int val) {
        heap.add(val);
        Collections.sort(heap);

        return heap.get(heap.size() - k);

    }
}
