class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        //Arrays.sort(nums);
        // int missing = 0;
        // int[] arr = new int[n+1];
        // for(int i=0;i<n+1;i++){
        //     arr[i] = i;
        // }

        // for(int i=0;i<n;i++){
        //     if(arr[i] != nums[i]  ){
        //         missing = arr[i];
        //         return missing; 
        //     }
        // }

        // return arr[n];

        // if(nums[0] !=0){
        //     return 0;
        // }
        // if(n==1&&nums[0]==0){
        //     return 1;
        // }
        // for(int i =1 ;i<n;i++){
        //     int dif = nums[i]-nums[i-1];
        //     if(dif>1){
        //      return nums[i-1]+1;   
        //     }
            
        // }
        // return nums[n-1]+1;





        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int val:nums){
        //     arr.add(val);
        // }
        // int missing = 0;
        // for(int i=0;i<=n;i++){
        //     if(!arr.contains(i)){
        //         missing = i;
        //         break;
        //     }
        // }
        // return missing;



        // int sum = n*(n+1)/2;
        // int rem = 0;
        // for(int i=0;i<n;i++){
        //     rem+=nums[i];
        // }
        // return sum-rem;

        int n = nums.length;

        int xor1 = 0;
        for(int i = 0;i<=n;i++){
            xor1 ^= i;
        }
        int xor2 = 0;
        for(int i = 0;i < n;i++){
            xor2 ^= nums[i];
        }
        return (xor1 ^ xor2);
    }
}