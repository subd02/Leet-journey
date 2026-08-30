class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int minidx=0;
        int maxidx=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
            if(nums[i]<nums[minidx]){
                minidx=i;
            }
        }
        int front1= maxidx+1;
        int back1= n-maxidx;
        int front2= minidx+1;
        int back2= n-minidx;
        return Math.min(Math.min(Math.max(front1,front2),Math.max(back1,back2)),Math.min(front1+back2,front2+back1));
    }
}