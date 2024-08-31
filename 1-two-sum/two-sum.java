class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;

        //Arrays.sort(nums);
        // int n = nums.length;
        // Integer[] idx = new Integer[n];
        
        // // Initialize the index array
        // for (int i = 0; i < n; i++) {
        //     idx[i] = i;
        // }

        // // Sort indices based on the values in nums
        // Arrays.sort(idx, Comparator.comparingInt(i -> nums[i]));

        // int left = 0;
        // int right = n - 1;

        // while (left < right) {
        //     int sum = nums[idx[left]] + nums[idx[right]];
        //     if (sum == target) {
        //         return new int[]{idx[left], idx[right]};
        //     } else if (sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return null; 
    }
}