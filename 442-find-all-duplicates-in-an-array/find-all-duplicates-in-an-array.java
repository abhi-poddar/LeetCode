class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]<0){
                ans.add(n);
            }
            else{
                nums[n-1]=-1*nums[n-1];
            }
        }
        return ans;
    }

}