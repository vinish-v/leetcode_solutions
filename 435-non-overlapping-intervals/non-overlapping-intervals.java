class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int count =0;
        int curr = intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            if(curr<= intervals[i][0]){
                curr = intervals[i][1];
            }
            else{
                count++;
                curr = Math.min(curr,intervals[i][1]);
            }
        }
        return count;
    }
}