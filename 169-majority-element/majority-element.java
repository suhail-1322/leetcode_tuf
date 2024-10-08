class Solution {
    public int majorityElement(int[] arr) {
        int candidate = findCandidate(arr);
        return candidate;
    }

    private int findCandidate(int[] arr) {
        int c = 0;
        int candidate = 0;

        for(int val : arr){
            if(c == 0){
                candidate = val;
            }

            c += (candidate == val) ? 1 : -1;
        }
        return candidate;
    }
}