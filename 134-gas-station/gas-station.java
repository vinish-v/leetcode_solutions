class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = Arrays.stream(gas).sum();
        int costSum = Arrays.stream(cost).sum();
        if(gasSum < costSum){
            return -1;
        }
        int start =0;
        int last = 0;
        for(int i =0;i<gas.length;i++){
            last += gas[i]-cost[i];
            if(last <0){
                start = i+1;
                last = 0;
            }
        }
        return start;
    }
}