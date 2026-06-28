class Solution {
    public int binary(int[] nums, int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid= si + ((ei-si)/2);
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return binary(nums, target, mid+1, ei);
        }else{
            return binary(nums, target, si, mid-1);
        }
    }
    public int search(int[] nums, int target) {
        int si=0;
        int ei= nums.length-1;
        return binary(nums, target, si, ei);
    }
}