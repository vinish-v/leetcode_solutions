class Solution {
    public int[][] generateMatrix(int n) {
        int  [][] res = new int [n][n];
        int size = n*n;
        int rows =n;
        int cols = n;
        int val=1;
        int left =0;
        int right = cols-1;
        int top =0;
        int bottom =rows-1;
        while(top<=bottom && left <=right && val<=size){
            for(int i=left;i<=right;i++){
                res[top][i]=val;
                val++;
            }
            top++;
            for(int i=top;i<=bottom ;i++){
                res[i][right] = val;
                val++;
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    res[bottom][i]=val;
                    val++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom ;i>=top;i--){
                    res[i][left]=val;
                    val++;
                }
                left++;
            }
        }
        return res;
    }
}