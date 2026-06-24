class Solution {
    public String removeOccurrences(String s, String part) {
        int n= s.length();
        int p= part.length();
        while(true){
            int pos= s.indexOf(part);
            
            if(pos!=-1){
                int last= pos+p;
                s= s.substring(0,pos) + s.substring(last);
            }else{
                break;
            }
        }
        return s;
    }
}