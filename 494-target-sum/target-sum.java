class Solution {

    public int findTargetSumWays(int[] arr, int target) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // Check if the target is achievable
        if (sum < Math.abs(target) || (target + sum) % 2 != 0) {
            return 0;
        }
        
        int S1 = (target + sum) / 2;
        return countSubsetsWithSum(arr, S1);
    }
    
    private int countSubsetsWithSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];
        
        // Initialize base case: There's one way to make sum 0 (using no elements)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        // Fill dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][sum];
    }
}