/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left =0,right=n;
        int ans=0;
        if(n==1) return 1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right = mid-1;
                ans=mid;
            }
            else {
                left = mid+1;
            }
            
        }
        return ans;


    }
}