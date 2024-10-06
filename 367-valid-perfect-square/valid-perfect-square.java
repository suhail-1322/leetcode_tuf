class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        int i = 2;
        int j = num / 2;

        while (i <= j) {
            long mid = (long) (i + (j - i) / 2);

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                j = (int) mid - 1;
            } else {
                i = (int) mid + 1;
            }
        }

        return false;
    }
}