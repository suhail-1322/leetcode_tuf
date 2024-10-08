class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int val : nums){
            q.offer(val);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.peek();
    }
}
