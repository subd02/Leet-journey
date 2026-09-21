class Solution {
    public boolean isSubsequence(String s, String t) {
        int strack=0;
        int ttrack=0;
        int count=0;
        while(strack<s.length() && ttrack<t.length()){
            if(s.charAt(strack)==t.charAt(ttrack)){
                count++;
                strack++;
                ttrack++;
            }else{
                ttrack++;
            }
            
        }
        if(s.length()==count){
            return true;
        }
        return false;
    }
}