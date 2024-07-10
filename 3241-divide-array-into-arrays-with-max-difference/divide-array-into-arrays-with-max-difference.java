class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int [][]arr = new int[nums.length/3][3];
        int indx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            int first=nums[i];
            int second=nums[i+1];
            int third = nums[i+2];
            if(third-first<=k){
                arr[indx][0]=first;
                arr[indx][1]=second;
                arr[indx][2]=third;
                indx++;
            }
            else{
                return new int[0][0];
            }
        } 
        return arr;
    }
}