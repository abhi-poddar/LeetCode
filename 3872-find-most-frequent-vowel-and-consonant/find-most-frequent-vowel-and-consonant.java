class Solution {
    public int maxFreqSum(String s) {
        int []freq = new int[26];
        for(int i =0;i<s.length();i++){
            int idx  = s.charAt(i)-'a';
            freq[idx]++;
        }
        int vmax = 0;
        int cmax = 0;
        for(int i = 0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                vmax = Math.max(vmax,freq[i]);
            }else{
                cmax  = Math.max(cmax,freq[i]);
            }
        }
        return vmax+cmax;
    }
}