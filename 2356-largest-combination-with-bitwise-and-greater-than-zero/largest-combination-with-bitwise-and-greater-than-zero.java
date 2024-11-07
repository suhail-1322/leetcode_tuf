class Solution {
    public int largestCombination(int[] nums) {
        int max = 0;
        int count = 0;
        for (int bit = 0; bit < 32; bit++) {
            int currentCount = 0;
            for (int num : nums) {
                if ((num & (1 << bit)) != 0) {
                    currentCount++;
                }
            }
            count = Math.max(count, currentCount);
        }
        
        return count;
    }
}