class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0||nums.length<3) return -1;
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        int mindif=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==target){
                    return target;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                int diff=Math.abs(sum-target);
                if(diff<mindif){
                    res=sum;
                    mindif=diff;
                }
            }
        }return res;
    }
}