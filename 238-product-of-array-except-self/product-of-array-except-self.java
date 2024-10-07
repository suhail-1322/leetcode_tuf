class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // int[] pre = new int[nums.length];
        // pre[0] = nums[0];
        // for(int i = 1;i<n;i++){
        //     pre[i] = nums[i]*pre[i-1];
        // }
        
        // int post[] = new int[n];
        // post[n-1] = nums[n-1];
        // for(int i = n-2;i>=0;i--){
        //     post[i] = nums[i] * post[i+1];
        // }

        // int[] ans = new int[n];
        // ans[0] = post[1];
        // ans[n-1] = pre[n-2];
        // for(int i = 1;i<n-1;i++){
        //     ans[i] = pre[i-1] * post[i+1];
        // }
        // return ans;

        int[] ans = new int[n];
        int left = 1;
        int right = 1;


        for(int i = 0;i<n;i++){
            ans[i] = left;
            left *= nums[i];
        }

        for(int i = n-1;i>=0;i--){
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;

    }
}