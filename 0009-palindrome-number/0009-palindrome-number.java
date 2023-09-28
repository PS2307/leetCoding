class Solution {
    public boolean isPalindrome(int x) {
        
        char[] chars = ("" + x).toCharArray();
        if(chars.length==1) return true;
        for(int i=0;i<chars.length/2;i++){
            if(chars[i]==chars[chars.length-i-1]) continue;
            else return false;
        }return true;
    }
}