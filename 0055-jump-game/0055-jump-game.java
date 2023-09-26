class Solution {
    public boolean canJump(int[] nums) {
        int fIndex=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if((i+nums[i])>=fIndex){
                fIndex=i;
            }
            
        }return fIndex==0;
    }
}