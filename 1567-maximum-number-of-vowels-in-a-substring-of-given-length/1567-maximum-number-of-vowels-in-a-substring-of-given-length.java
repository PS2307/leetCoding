class Solution {
    public int maxVowels(String s, int k) {
        int curVows=0,maxVows=0;
        Set<Character> set=new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                curVows++;
            }
        }maxVows=curVows;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))){
                curVows--;
            }
            if(set.contains(s.charAt(i))){
                curVows++;
            }
            maxVows=Math.max(maxVows,curVows);
        }
        return maxVows;
    }
}