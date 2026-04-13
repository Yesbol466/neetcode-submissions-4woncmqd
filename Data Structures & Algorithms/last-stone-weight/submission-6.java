class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i : stones){
            heap.offer(i);
        }

        while(heap.size() > 1){
            int a = heap.peek();

            heap.poll();

            if(a - heap.peek() == 0) heap.poll();
            else if(a - heap.peek() > 0){
                a -= heap.peek();
                heap.poll();
                heap.offer(a);
            } 
        } 

        return heap.size()!= 0 ? heap.peek() : 0;
    }
}
