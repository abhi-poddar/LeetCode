class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int temp=nums.length;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans=temp-k;
        }
        return nums[ans];
    }
}