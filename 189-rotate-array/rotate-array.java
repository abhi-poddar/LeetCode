class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=1){
            return;
        }else if (k > nums.length) {
            k = k % nums.length;
        }
        int[]ans = new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[j++]=nums[i];
        }
        for(int r=0;r<nums.length-k;r++){
            if (j < nums.length - 1)
                ans[j++] = nums[r];
            else
                ans[j] = nums[r];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}