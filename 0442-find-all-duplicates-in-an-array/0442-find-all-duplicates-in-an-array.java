class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        if(nums.length<=1) return res;
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i])-1;
            if(nums[n]<0){
                 res.add(n+1);                
            }
            nums[n]=nums[n]*-1;
        }return res;
        
    }
}