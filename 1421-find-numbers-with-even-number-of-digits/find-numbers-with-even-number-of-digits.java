class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        int numberofdigit=digit(nums);
        if(numberofdigit%2==0){
            return true;
        }
        return false;
    }
    static int digit(int nums){
        if(nums<0){
            nums = nums*-1;
        }
        return (int)(Math.log10(nums))+1;
    }
}