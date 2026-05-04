class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; 

            if (nums[index] < 0) {
               
                result.add(Math.abs(nums[i]));
            } else {
                
                nums[index] = -nums[index];
            }
        }

        return result;
    }



















    // public List<Integer> findDuplicates(int[] nums) {

    //     Map<Integer,Integer>map = new HashMap<>();
    //     List<Integer> result = new ArrayList<>();
    //     for(int num : nums){
    //         map.put(num,map.getOrDefault(num,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> e : map.entrySet()){
    //         if(e.getValue() > 1){
    //              result.add(e.getKey());
    //         }
    //     }
    //     return result;
    // }
}