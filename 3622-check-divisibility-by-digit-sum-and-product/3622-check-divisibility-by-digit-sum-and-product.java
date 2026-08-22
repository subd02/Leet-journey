class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum=0;
        int prod=1;
        int demo=n;
        while(demo>0){
            sum += demo%10;
            prod*= demo%10;
            demo/=10;
        }
        int divisor= sum+prod;
        return n%divisor==0;
    }
}