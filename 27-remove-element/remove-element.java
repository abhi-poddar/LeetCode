class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i : nums){
            if(i!=val){
                nums[k]= i ;
                k++;
            }
        }
        return k;
    }

}