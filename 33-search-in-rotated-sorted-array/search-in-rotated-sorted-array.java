class Solution {
    public int search(int[] nums, int target) {
        return binSearch(nums,target,0,nums.length-1);
    }
    static int binSearch(int[]arr,int key,int s,int e){
        if(s>e){
            return -1;
        }

        int mid = s+(e-s)/2;
        if(key==arr[mid]){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(arr[s]<=key && key<=arr[mid]){
                return binSearch(arr,key,s,mid-1);
            }
            else{
                return binSearch(arr,key,mid+1,e);
            }
        }
        if(arr[mid]<=key && key<=arr[e]){
            return binSearch(arr,key,mid+1,e);
        }
        return binSearch(arr,key,s,mid-1);
    }
}