class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    //     int i=0;
    //     while (i<nums.length){
    //         int correct = nums[i]-1;
    //         if(nums[i]!=i+1){
    //             if(nums[i] != nums[correct]){
    //                 swap(nums,i,correct);
    //             }
    //             else{
    //                 return nums[i];
    //             }
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     return -1;
    // }
    // static void swap(int []arr,int first,int second){
    //     int temp = arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;

    }
}