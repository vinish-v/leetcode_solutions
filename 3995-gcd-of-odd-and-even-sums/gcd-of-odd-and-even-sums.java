class Solution {
    public int gcdOfOddEvenSums(int n) {
        /**int i=1;
        int odd=0;
        int even =0;
        while(i<=n){
            odd+=(2*i-1);
            even+=(2*i);
            i++;
        }
        return calgcd(odd,even);
    }
    private int calgcd(int a , int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;**/
        return n;
    }
}