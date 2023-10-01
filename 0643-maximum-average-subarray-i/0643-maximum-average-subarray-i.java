class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr=0,max=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=curr=sum/k;
        curr=0;

        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            curr=sum/k;
            max=Math.max(max,curr);
            curr=0;
        }return max;

        
    }
}