class Solution {
    public int search(int[] nums, int target) {
        return modBin(nums, target, 0, nums.length-1);
        
    }
    private int modBin(int[] nums, int target, int left, int right){
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(target==nums[mid]) return mid;
        
        if(nums[mid]>=nums[left]){
            if(target<=nums[mid] && target>=nums[left]) return modBin(nums,target,left,mid-1);
            else return modBin(nums,target,mid+1,right);
        }
        else{
            if(target>=nums[mid] && target<=nums[right]) return modBin(nums,target,mid+1,right);
            else return modBin(nums,target,left,mid-1);
        }

    }
}