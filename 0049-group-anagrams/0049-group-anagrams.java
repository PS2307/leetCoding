class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0||strs==null) return new ArrayList<>();

        Map<String,List<String>> freqList=new HashMap<>();
        for(String str : strs){
            String freq=frequencyString(str);
            if(freqList.containsKey(freq)){
                freqList.get(freq).add(str);
            }
            else{
                List<String> nstr=new ArrayList<>();
                nstr.add(str);
                freqList.put(freq,nstr);
            }
        }return new ArrayList<>(freqList.values());
        
    }
    private String frequencyString(String str){
        int[] fre=new int[26];
        for(char c:str.toCharArray()){
            fre[c-'a']++;
        }

        StringBuilder freq=new StringBuilder("");
        char c='a';
        for(int i:fre){
            freq.append(c);freq.append(i);c++;
        }
        return freq.toString();
    }
}