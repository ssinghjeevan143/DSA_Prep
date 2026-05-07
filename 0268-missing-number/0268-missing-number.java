import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {

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



        int n = nums.length;
        int expectedSum = n * (n + 1)/2;

        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}