class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int maxw=0;
        Arrays.sort(points, (p1,p2)->(p1[0]-p2[0]));
        for(int i=0;i<points.length-1;i++){
            int point1[]=points[i];
            int point2[]=points[i+1];
            maxw=Math.max(maxw, point2[0]-point1[0]);
        }
        return maxw;
    }
}