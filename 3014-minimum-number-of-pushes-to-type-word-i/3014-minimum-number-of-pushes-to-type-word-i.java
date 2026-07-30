class Solution {
    public int minimumPushes(String word) {
        int total=0;
        int n= word.length();
        for(int i=0; i<n; i++){
            total += (i/8)+1 ;
        }
        return total;
    }
}