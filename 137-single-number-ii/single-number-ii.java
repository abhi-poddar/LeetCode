class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            boolean found =false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                ans=nums[i];
            }
        }
        return ans;
    }
}