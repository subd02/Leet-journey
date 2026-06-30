class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;
        int slow= nums[0];
        int fast= nums[0];

        do{
            //slow goes 1 fast goes 2
            slow=nums[slow];
            fast= nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];

        while(slow!=fast){
            //slow and fast go one
            slow=nums[slow];
            fast= nums[fast];
        }
        return slow;
    }
}