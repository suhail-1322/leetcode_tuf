/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;


        while(i<=j){
            int mid = i + (j-i)/2;

            if(isBadVersion(mid) == false){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return i;
    }
}