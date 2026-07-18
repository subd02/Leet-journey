class Solution {
    public String longestPrefix(String s) {
        int[] lps= new int[s.length()];
        lps[0]= 0;
        int len=0, i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]= len;
                i++;
            }else{
                if(len!=0){
                    len= lps[len-1];

                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int idx= lps[s.length()-1];
        return s.substring(0,idx);
    }
}