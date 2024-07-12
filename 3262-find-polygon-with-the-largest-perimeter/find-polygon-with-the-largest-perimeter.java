class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long para=0;
        for(int i=0;i<nums.length;i++){
            para+=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            int val = nums[j];
            para-=val;
            if(para>val){
                return para+val;
            }
        }
        return -1;
    }
}