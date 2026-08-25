import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {
//cyclic sort
        int i = 0;
        
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
            }else{
                i++;
            }
            
        }
        for(int index = 0 ; index < nums.length; index++){
            if(nums[index] != index ){
                return index;
            }
        }
        return nums.length;

        // HashSet<Integer> set = new HashSet<>();

        // for(int num : nums) {
        //     set.add(num);
        // }

        // for(int i = 0; i <= nums.length; i++) {

        //     if(!set.contains(i)) {
        //         return i;
        //     }
        // }

        // return -1;



        // Arrays.sort(nums);
        // for(int i = 0; i<= nums.length-1;i++){
        //     if(nums[i] != i) return i;
        // }
        // return nums.length;



        // int n = nums.length;
        // int expectedSum = n * (n + 1)/2;

        // int actualSum = 0;
        // for(int num : nums){
        //     actualSum += num;
        // }
        // return expectedSum - actualSum;
    }
}