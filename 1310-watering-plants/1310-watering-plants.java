class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step=0;
        int temp=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=temp){
                temp-=plants[i];
                step++;
            }
            else{
                step=(2*i)+1+step;
                temp=capacity;
                temp-=plants[i];
            }
        }
        return step;
    }
}