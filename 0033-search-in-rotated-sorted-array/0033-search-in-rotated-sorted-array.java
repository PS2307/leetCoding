class Solution {
    public int search(int[] nums, int target) {
        // if(nums.length==0) return -1;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        // if(map.containsKey(target)) return map.get(target);
        // else return -1;

        return modifiedBinary(nums,target,0,nums.length-1);
        
        
    }
    private int modifiedBinary(int[] arr, int target, int left, int right){
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(arr[mid]==target) return mid;

        
        if(arr[mid]>=arr[left]){
            if(target<=arr[mid] && target>=arr[left]) return modifiedBinary(arr,target,left,mid-1);
            else return modifiedBinary(arr,target,mid+1,right);
        }
        else{
            if(target>=arr[mid] && target<=arr[right]) return modifiedBinary(arr,target,mid+1,right);
            else return modifiedBinary(arr,target,left,mid-1);
        }

    }
}