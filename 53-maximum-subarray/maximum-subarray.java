class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        // int sum = arr[0];
        // int tsum = arr[0];

        // for(int i=1;i<n;i++){
        //     sum = Math.max(arr[i],arr[i]+sum);

        //     if(sum>tsum){
        //         tsum = sum;
        //     }
        // }
        // return tsum;


        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int val : arr){
            sum += val;
            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0 ){
                sum = 0;
            }
        }
        return maxi ;

        
    }
}