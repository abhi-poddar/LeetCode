class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                int val = hm.get(s.charAt(i));
                val++;
                hm.put(s.charAt(i),val);
            }
        }
        List<Character>l = new ArrayList<>();
        for(Map.Entry<Character,Integer>mpp : hm.entrySet()){
            if(mpp.getValue() == 1){
                l.add(mpp.getKey());
            }
        }
        List<Integer>ll = new ArrayList<>();
        for(int i = 0;i<l.size();i++){
            char ch = l.get(i);
            int idx = s.indexOf(ch);
            ll.add(idx);
        }

       Collections.sort(ll);
       if(ll.size() == 0)return -1;
       else return ll.get(0);
    }
}