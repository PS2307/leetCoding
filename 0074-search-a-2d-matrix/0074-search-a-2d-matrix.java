class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int srow=0,scol=0;
        int mrow=matrix.length-1;
        int mcol=matrix[0].length-1;

        HashSet<Integer> set=new HashSet<>();
        while(srow<=mrow && scol<=mcol){
            if(scol<mcol){
                set.add(matrix[srow][scol]);
                scol++;
            }
            if(scol==mcol){
                set.add(matrix[srow][scol]);
                srow++;
                scol=0;
            }
        }
        if(set.contains(target))return true;
        else return false;
        
    }
}