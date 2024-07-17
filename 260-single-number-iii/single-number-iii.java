class Solution {
    public int[] singleNumber(int[] nums) {
        int []ans =new int[2];
        int k=0;
        if(nums.length<=2){
            return nums;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    found =true;
                    break;
                }
            }
            if(!found){
                ans[k++]=nums[i];
            }
        }
        return ans;
    }
}