class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;

        List<String> list = new ArrayList<>();
        
        for(int j = 0;j<nums.length;j++){
            if(j == nums.length-1 || nums[j]+1 != nums[j+1]){
                if(i == j){
                    list.add(String.valueOf(nums[i]));
                }
                else{
                    list.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[j]));
                }
                i = j+1;
            }

        }
        return list;
    }
}