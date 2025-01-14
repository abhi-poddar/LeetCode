class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r){
            
            int breadth = Math.min(height[l], height[r]);
            maxVol = Math.max(maxVol, (r-l) * breadth);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxVol;
    }
}