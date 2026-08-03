class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gsum=0;
        int csum=0;

        
        int start=0, currGas=0;
        for(int i=0; i<gas.length; i++){
            gsum+= gas[i];
            csum+= cost[i];

            currGas+= gas[i]- cost[i];
            if(currGas<0){
                start= i+1;
                currGas= 0;
            }
            
        }
        if(csum>gsum){
            return -1;
        }
        return start;
    }
}