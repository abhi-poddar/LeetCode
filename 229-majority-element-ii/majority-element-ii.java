class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int occ =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                occ++;
            }
            else{
                if(occ>nums.length/3){
                ans.add(nums[i]);
                }
                occ=1;
            }
        }
        if(occ>nums.length/3){
            ans.add(nums[nums.length-1]);
        }
        return ans;
    }
}