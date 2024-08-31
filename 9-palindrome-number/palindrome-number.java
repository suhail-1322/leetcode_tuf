class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int orig = x;
        int rev =0;
        while(x!=0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x/=10;
        }
        return rev==orig;
    }
}