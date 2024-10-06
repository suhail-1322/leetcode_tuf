class Solution {
    public int climbStairs(int n) {
        // if(n==0 || n==1){
        //     return 1;
        // }
        // int[] dp = new int[n+1];
        // dp[0]=dp[1] =1;
        // for(int i=2;i<n+1;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        int prev1 = 1;
        int prev2 = 1;

        for(int i=2;i<n+1;i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}