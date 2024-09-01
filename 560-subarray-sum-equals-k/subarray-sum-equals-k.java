class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum == k) {
        //             count++;
        //         }
        //     }

        // }
        // return count;

        HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;
    int preSum = 0;
    //int count = 0;

    // Initialize the map with base case (0,1)
    map.put(0, 1);
    
    for (int i = 0; i < n; i++) {
        preSum += nums[i];
        
        // If preSum - k exists in the map, add the frequency to count
        if (map.containsKey(preSum - k)) {
            count += map.get(preSum - k);
        }
        
        // Add the current preSum to the map, incrementing the frequency
        map.put(preSum, map.getOrDefault(preSum, 0) + 1);
    }
    
    return count;
    }
}