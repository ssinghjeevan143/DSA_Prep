class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        Map<Integer,Integer>map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                 result.add(e.getKey());
            }
        }
        return result;
    }
}