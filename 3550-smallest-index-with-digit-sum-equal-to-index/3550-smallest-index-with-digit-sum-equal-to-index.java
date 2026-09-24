class Solution {
    public int sum(int val){
        int sum=0;
        while(val>0){
            sum+=val%10;
            val/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int currsum= sum(nums[i]);
            if(i==currsum){
                return i;
            }
        }
        return -1;
    }
}