class Solution {
    private void findSubsets(int[] nums, int idx, List<Integer> current, List<List<Integer>> result){
        if(idx==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        //add els
        current.add(nums[idx]);
        findSubsets(nums, idx+1, current, result);

        //remove el
        current.remove(current.size()-1);
        findSubsets(nums, idx+1, current, result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        findSubsets(nums, 0, current, result);
        return result;
    }
}