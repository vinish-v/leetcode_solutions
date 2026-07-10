class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int limit = len/4;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > limit){
                return key;
            }
            
        }
        return -1;
    }
}