class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int ans=0, lmax=0, l=0, rmax=0, r=n-1;
        
        while(l<r){
            lmax= Math.max(lmax, height[l]);
            rmax= Math.max(rmax, height[r]);

            if(lmax<rmax){
                ans+= lmax- height[l];
                l++;
            }else{
                ans+= rmax-height[r];
                r--;
            }
        }
        
        return ans;
    }
}