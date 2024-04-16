class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            int len = words[i].length();
            for(int j=0;j<len;j++){
                char ch = words[i].charAt(j);
                if(x==ch){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}