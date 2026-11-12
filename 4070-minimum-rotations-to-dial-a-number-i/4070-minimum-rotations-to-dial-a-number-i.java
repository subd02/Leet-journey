class Solution {
    public int minRotations(String s) {
        int ans=0;
        ans+=Math.min(Math.abs(Integer.parseInt(String.valueOf(s.charAt(0)))-0), 10-Math.abs(Integer.parseInt(String.valueOf(s.charAt(0)))-0));
        for(int i=1; i<s.length(); i++){
            int first= Integer.parseInt(String.valueOf(s.charAt(i)));
            int second= Integer.parseInt(String.valueOf(s.charAt(i-1)));
            int diff= Math.min(Math.abs(second-first), 10-Math.abs(second-first));
            ans+=diff;
        }
        return ans;
    }
} 