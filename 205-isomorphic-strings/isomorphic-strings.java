class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastSeenS =new int[256];
        int [] lastSeenT = new int[256];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(lastSeenS[c1] != lastSeenT[c2]){
                return false;
            }
            lastSeenS[c1] =i+1;
            lastSeenT[c2] =i+1;
        }
        
        return true;
    }
    
}