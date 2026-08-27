class Solution {
    public void moveZeroes(int[] nums) {
        int first= 0;
        for(int num:nums){
            if (num!=0){
                nums[first]=num;
                first++;
            }
        }
        for(int i=first; i<nums.length; i++){
            nums[i]=0;
        }

    }
}