class Solution {
    public int maxArea(int[] height) {
        int maxVol = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;

        while(l < r){
            int length = r - l;
            int breadth = Math.min(height[l], height[r]);
            maxVol = Math.max(maxVol, length * breadth);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxVol;
    }
}