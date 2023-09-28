class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        backTrack(result,new ArrayList<>(), nums);
        return result;
        
    }
    void backTrack(List<List<Integer>> result, ArrayList<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int number : nums){
            if(temp.contains(number)){
                continue;
            }
            temp.add(number);
            backTrack(result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}