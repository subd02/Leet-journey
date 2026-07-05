class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){return true;}
        
        while(n>0 && (n%2==0||n==1)){
            if(n==1){
            return true;
        }
        if(n%2==0){
            n/=2;
        }
            
        }
        return false;
    }
}