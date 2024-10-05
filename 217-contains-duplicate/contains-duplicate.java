class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Integer val : map.keySet()){
            if(map.get(val) > 1) return true;
        }
        return false;
    }
}