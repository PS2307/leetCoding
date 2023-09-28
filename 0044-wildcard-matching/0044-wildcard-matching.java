// class Solution {
//     boolean solve(String str, String pattern, int i, int j){
//         if(i<0&&j<0){
//             return true;
//         }
//         if(i>=0&& j<0){
//             return false;
//         }
//         if(i<0 && j>=0){
//             for(int x=0;x<=j;x++){
//                 if(pattern.charAt(x)!='*'){
//                 return false;
//             }
//             }
            
//             return true;
//         }
//         if(str.charAt(i)==pattern.charAt(j) || pattern.charAt(j)=='?'){
//             return solve(str,pattern,i-1,j-1);
//         }
//         if(pattern.charAt(j)=='*'){
//             return(solve(str,pattern,i-1,j) || solve(str,pattern,i,j-1));
//         }
        
//             return false;
        
//     }
//     public boolean isMatch(String s, String p) {
//         int i=s.length()-1,j=p.length()-1;
//         return solve(s, p, i,j);
        
//     }
// }


class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()][p.length()];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(s, p, s.length() - 1, p.length() - 1, dp);
    }

    private boolean helper(String s, String p, int i, int j, int[][] dp) {
        if(i < 0 && j < 0) return true;
        if(i >= 0 && j < 0) return false;
        if(i < 0 && j >= 0) {
            for(int k = 0; k <= j; k++) {
                if(p.charAt(k) != '*') return false;
            }
            return true;
        }

        if(dp[i][j] != -1) return dp[i][j] == 1;

        boolean result = false;
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') result = helper(s, p, i-1, j-1, dp);
        if(p.charAt(j) == '*') result = helper(s, p, i, j-1, dp) || helper(s, p, i-1, j, dp);

        dp[i][j] = result ? 1 : 0;
        return result; 
    }
}
