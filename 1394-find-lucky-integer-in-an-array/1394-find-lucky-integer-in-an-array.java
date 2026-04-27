class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int result = -1;
        for(Map.Entry<Integer, Integer>e : map.entrySet()){
            int num = e.getKey();
            int count = e.getValue();
            if(num == count){
                result = Math.max(result,num);
            }
        }
        return result;
    }
}