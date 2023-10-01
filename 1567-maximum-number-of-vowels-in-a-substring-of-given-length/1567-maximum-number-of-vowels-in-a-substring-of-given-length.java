class Solution {
    public int maxVowels(String s, int k) {
        int maxVows=0,winVows=0;
        Set<Character> vowelSet=new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        for(int i=0;i<k;i++){
            if(vowelSet.contains(s.charAt(i))){
                winVows++;
            }
        }
        maxVows=winVows;

        for(int i=k;i<s.length();i++){
            if(vowelSet.contains(s.charAt(i-k))){
                winVows--;
            }

            if(vowelSet.contains(s.charAt(i))){
                winVows++;
            }

            maxVows=Math.max(winVows,maxVows);
            // if(maxVows==k) return k;
        }return maxVows;
        
    }
}