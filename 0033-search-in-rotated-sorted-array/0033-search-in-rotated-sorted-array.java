class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        if(map.containsKey(target)) return map.get(target);
        else return -1;
        
        
    }
}