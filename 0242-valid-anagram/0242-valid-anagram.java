class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // HashMap<Character,Integer> map=new HashMap<>();
        // String[] strSplit = s.split("");
        // ArrayList<String> alist=new ArrayList<>(Arrays.asList(strSplit));
        // for(int i=0;i<s.length();i++){
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        // }
        // // for(int i=0;i<t.length();i++){
        // //     if(!map.containsKey(t.charAt(i))) return false;
        // //     else map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        // // }
        // // System.out.println(map);
        // // map.forEach((key,value) -> {
        // //     if((value/2)!=0) return false;
        // // });

        // HashMap<Character,Integer> mapt=new HashMap<>();
        //  for(int i=0;i<t.length();i++){
        //     if(!map.containsKey(t.charAt(i))) return false;
        //     else mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        // }
        // // for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
        // //     if((entry.getValue()/2)!=0) return false;
        // // }
        // // for(int i=0;i<s.length();i++){
        // //     if(map.get(s.charAt(i))%2!=0) return false;
        // // }
        // for(String i:alist){
        //     if(map.get(i)!=mapt.get(i)) return false;
        // }
        // return true;
        String sFreq=getFreq(s);
        String tFreq=getFreq(t);
        return sFreq.equals(tFreq);
    }
    private String getFreq(String str){
        int[] list=new int[26];
        for(char c:str.toCharArray()){
            list[c-'a']++;
        }

        StringBuilder strs=new StringBuilder("");
        char c='a';
        for(int i:list){
            strs.append(c);
            strs.append(i);
            c++;
        }return strs.toString();
    }
}