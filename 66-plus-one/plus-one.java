class Solution {
    public int[] plusOne(int[] digits) {
        int crr =1;
        for(int i=digits.length-1;i>=0&&crr==1;i--){
            int temp = digits[i]+crr;
            if(temp>=10){
                crr=1;
                digits[i]=temp%10;
            }
            else{
                crr=0;
                digits[i]=temp;
            }
        }
        if(crr!=0){
            int[] newdigits=new int[digits.length+1];
            newdigits[0]=1;
            for(int j=1;j<newdigits.length;j++){
                newdigits[j]=digits[j-1];
            }
            return newdigits;
        }
        return digits;
    }
}