class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,max=0;
        int start=0,end=k;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }max=sum;
        while(end<nums.length){
            sum-=nums[start];start++;
            sum+=nums[end];end++;
            max=Math.max(sum,max);
        }return (double) max/k;
        
    }
}