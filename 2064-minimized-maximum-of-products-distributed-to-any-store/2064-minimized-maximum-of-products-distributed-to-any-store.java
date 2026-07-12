class Solution {
    public boolean isValid(int[] quantities, int n, int mid){
        int storesNeeded=0;
        if (mid == 0) return false;
        for(int q: quantities){
            storesNeeded += (q+mid-1)/mid;
            if(storesNeeded>n){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int sum=0;
        
        for(int i = 0; i < quantities.length; i++){
            sum = Math.max(sum, quantities[i]);
        }
        int si= 1, ei= sum, ans=-1;
        while(ei>=si){
            int mid= si+ (ei-si)/2;
            if(isValid(quantities, n, mid)){
                ans= mid;
                ei= mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }
}