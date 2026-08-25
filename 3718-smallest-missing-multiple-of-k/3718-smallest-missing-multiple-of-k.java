class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        //2 3 4 6 8 
        //k=2
        int target=k;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                if(nums[i]==target){
                target+=k;
            }else{
                return target;
            }
            }
        }
        return target;
    }
}