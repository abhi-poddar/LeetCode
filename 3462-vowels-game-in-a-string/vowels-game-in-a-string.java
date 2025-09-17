class Solution {
    public boolean doesAliceWin(String s) {
        int count =0;
        for(int i = 0;i<s.length();++i){
            char val = s.charAt(i);
            if(val =='a'||val=='e'||val=='i'||val=='o'||val=='u'){
                count++;
            }

        }
        if(count == 0){
            return false;
        }
        else{
            return true;
        }
  
    }
}