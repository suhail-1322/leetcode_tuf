import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        //findCombi(candidates, target, list, new ArrayList<>(), 0);

        solve(candidates, list, new ArrayList<>(), 0, target);
        return list;
    }

    // static void findCombi(int[] arr, int target, List<List<Integer>> list, List<Integer> temp, int start) {
   
    //     if (target == 0) {
    //         list.add(new ArrayList<>(temp));
    //         return;
    //     }

        
    //     for (int i = start; i < arr.length; i++) {
    //         if (arr[i] > target) {
    //             continue;
    //         }
    //         temp.add(arr[i]);

    //         findCombi(arr, target - arr[i], list, temp, i);
    //         temp.remove(temp.size() - 1);
    //     }
    // }

    static void solve(int[] arr, List<List<Integer>> list, List<Integer> temp, int index, int target) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }

        // Include the current element and allow it to be reused
        temp.add(arr[index]);
        solve(arr, list, temp, index, target - arr[index]); // Notice index is not incremented
        temp.remove(temp.size() - 1); // Backtrack

        // Exclude the current element and move to the next
        solve(arr, list, temp, index + 1, target);
    }
}