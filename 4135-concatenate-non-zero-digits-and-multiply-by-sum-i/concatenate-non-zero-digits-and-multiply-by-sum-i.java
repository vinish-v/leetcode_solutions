class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        StringBuilder val = new StringBuilder();
        long tot =0;
        while(n!=0){
            int curr = n%10;
            if(curr !=  0){
                val.append(curr);
                tot += curr;
            }
            n =n/10;
        
        }
        val.reverse();
        long new_val = Long.parseLong(val.toString());
        long res = tot * new_val;
        return res;
    }
}