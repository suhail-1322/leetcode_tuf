class Solution {
    public int majorityElement(int[] arr) {
        int candidate = findCandidate(arr);
        return candidate;
    }

    private int findCandidate(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}