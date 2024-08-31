import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;

        while(i<nums.length){
            if(nums[i]==nums[j]){
                i++;
            }
            else{
                nums[j+1] = nums[i];
                i++;
                j++;
            }
        }
        return j+1;
    }
}