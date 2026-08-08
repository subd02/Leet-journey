class Solution {
    public void rotate(int[] nums, int k) {
        //1 2 3 4 5 6 7  k=3
        //7 6 5 4 3 2 1 1st k els
        //5 6 7 4 3 2 3  last n-k n=7
        //5 6 7 1 2 3 4
        

        int n= nums.length;
        k=k%n;
        for(int i=0; i<n/2; i++){
            int temp= nums[i];
            nums[i]= nums[n-1-i];
            nums[n-1-i]= temp;
        }
        for(int i=0; i<k/2; i++){
            int temp= nums[i];
            nums[i]= nums[k-1-i];
            nums[k-1-i]= temp;
        }
        int first=k;
        int last=n-1;
        while(first<=last){
            int temp= nums[first];
            nums[first]= nums[last];
            nums[last]= temp;
            first++;
            last--;
        }
    }
}