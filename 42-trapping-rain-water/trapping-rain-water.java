class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            lmax = Math.max(lmax, height[i]);
            leftMax[i] = lmax;
        }

        for (int i = n - 1; i >= 0; i--) {
            rmax = Math.max(rmax, height[i]);
            rightMax[i] = rmax;
        }

        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            ans += minHeight - height[i];
            
        }

        return ans;
    }
}
