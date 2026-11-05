class Solution {
    public boolean range(int[] arr, int low, int high){
        int si=0, ei=arr.length-1;
        while(si<=ei){
            int mid= si+ (ei-si)/2;
            if(arr[mid]>= low && arr[mid]<=high){
                return false;
            }else if(arr[mid]<low){
                si= mid+1;
            }else{
                ei= mid-1;
            }
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans=0;
        for(int i=0;i<arr1.length; i++){
            if(range(arr2,arr1[i]-d, arr1[i]+d)){
                ans++;
            }
        }
        return ans;
    }
}