class Solution {
    public int minimumMoves(String s) {
        int steps =0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                steps++;
            }
            else{
                i++;
            }
        }
        return steps;
    }
}