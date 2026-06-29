class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i= 0;
        int j=0;
        String ans="";
        while(i<word1.length() && j<word2.length()){
            ans+= word1.charAt(i);
            ans+= word2.charAt(j);
            i++;
            j++;
        }
            for(int k=i; k<word1.length(); k++){
                ans+= word1.charAt(k);
            }
        
            for(int k=j; k<word2.length(); k++){
                ans+= word2.charAt(k);
            }
        
        return ans;
    }
}