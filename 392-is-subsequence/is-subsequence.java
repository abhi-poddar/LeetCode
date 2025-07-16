class Solution {
    public static int checkCount(int i, int j , String s, String t, int count){
        if(i == s.length() || j==t.length())return 0;
        if(s.charAt(i)==t.charAt(j)){
            return count = 1 + checkCount(i+1,j+1,s,t,count);
        }else{
            return count  = checkCount(i,j+1,s,t,count);
        }
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count  = 0;
        int ans  = checkCount(i,j,s,t,count);
        if(ans == s.length())return true;
        else return false;
    }
}