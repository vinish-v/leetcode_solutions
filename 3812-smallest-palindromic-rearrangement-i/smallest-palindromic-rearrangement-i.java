class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int half = n/2;
        char[] left = s.substring(0,n/2).toCharArray();
        Arrays.sort(left);
        StringBuilder sb = new StringBuilder();
        sb.append(left);
        if(n%2==1){
            sb.append(s.charAt(n/2));
        }
        for(int i=left.length-1;i>=0;i--){
            sb.append(left[i]);
        }
        return sb.toString();
        
    }
}