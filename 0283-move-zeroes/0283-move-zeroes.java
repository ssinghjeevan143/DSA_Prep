class Solution {
    public void moveZeroes(int[] nums) {

        int start = 0;
        
        for(int num : nums){
            if(num  != 0){
                nums[start++] = num;
            }
        }

        while(start < nums.length){
            nums[start++] = 0;
        }
    }
}