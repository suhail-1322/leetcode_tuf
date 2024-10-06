class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : stones) {
            q.offer(val);
        }

        while (q.size() > 1) {
            int y = q.poll();
            int x = q.poll();
            if (x != y) {
                q.offer(y - x);
            }
        }
        if (q.isEmpty())
            return 0;
        else
            return q.poll();
    }
}