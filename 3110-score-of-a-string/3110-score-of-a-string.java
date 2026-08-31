class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=s.length()-1; i>0; i--){
            ans+= Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return ans;
    }
}