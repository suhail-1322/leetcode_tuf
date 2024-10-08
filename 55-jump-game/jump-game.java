class Solution {
    public boolean canJump(int[] nums) {
        // int target = nums.length-1;

        // for(int i = target;i >=0;i--){
        //     if((i + nums[i]) >= target){
        //         target = i;
        //     }
        // }
        // if(target == 0){
        //     return true;
        // }

        // return false;
        int maxId = 0;

        for(int i = 0;i<nums.length-1;i++){
            if(i > maxId) return false;
            maxId = Math.max(i+nums[i],maxId);
        }
        //System.out.println(maxId);
        return maxId >= nums.length-1;
    }
}