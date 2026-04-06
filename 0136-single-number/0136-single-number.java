class Solution {

    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num; 
        }
        return unique;
    }


    // public int singleNumber(int[] nums) {
    //     Map<Integer,Integer>map = new HashMap<>();
    //     for(int num : nums){
    //         map.put(num,map.getOrDefault(num,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> e : map.entrySet()){
    //         if(e.getValue() < 2){
    //             return e.getKey();
    //         }
    //     }
    //     return -1;
    // }
}