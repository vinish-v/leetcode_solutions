class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            int currDiff = arr[i] - arr[i-1];
            if(currDiff < min){
                min = currDiff;
                res.clear();
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(currDiff == min ){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}