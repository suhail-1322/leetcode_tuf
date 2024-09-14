import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        // outer.add(new ArrayList<>());
        // int start = 0;
        // int end = 0;
        // for(int i=0;i<nums.length;i++){
        // int size = outer.size();
        // if(i>0 && nums[i]==nums[i-1]){
        // start = end+1;
        // }
        // end = size-1;
        // for(int j=start;j<size;j++){
        // List<Integer> internal = new ArrayList<>(outer.get(j));
        // internal.add(nums[i]);
        // outer.add(internal);
        // }
        // }
        // return outer;
        int n = 1 << nums.length;
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            outer.add(list);
        }
        return outer;
    }

    // static void gen(int[] arr1, int[] arr, int index, List<List<Integer>>
    // subsets) {
    // if (index == arr.length) {
    // List<Integer> subset = new ArrayList<>();
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 1) {
    // subset.add(arr1[i]);
    // }
    // }
    // subsets.add(subset);
    // return;
    // }

    // arr[index] = 0;
    // gen(arr1, arr, index + 1, subsets);

    // arr[index] = 1;
    // gen(arr1, arr, index + 1, subsets);
    // }
}
