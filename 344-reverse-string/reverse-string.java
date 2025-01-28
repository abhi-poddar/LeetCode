class Solution {
    public void reverseString(char[] s) {
        helper(s,0);
    }
    public void helper(char[]arr,int i){
        if(i>=arr.length/2){
            return;
        }
        char temp = arr[arr.length-i-1];
        arr[arr.length-i-1]=arr[i];
        arr[i]=temp;
        helper(arr,++i);
    }
}