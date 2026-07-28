class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        int n = version1.length();
        int m = version2.length();
        while(i<n || j<m){
            int sum1=0,sum2=0;
            while(i<n && version1.charAt(i) != '.'){
                sum1=sum1*10+(version1.charAt(i) - '0');
                i++;
            }
            while(j<m && version2.charAt(j) != '.'){
                sum2=sum2*10+(version2.charAt(j) - '0');
                j++;
            }
            if(sum1<sum2){
                return -1;
            }
            if(sum1>sum2){
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}