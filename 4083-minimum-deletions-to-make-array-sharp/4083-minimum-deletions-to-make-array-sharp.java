class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        int first=0;
        int second=1;
        while(second!=nums.length){
            if(nums[first++]==nums[second++]){
                count++;
            }
        }
        return count;
    }
}