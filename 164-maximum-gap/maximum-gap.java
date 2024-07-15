class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            int sum = nums[i+1]-nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}