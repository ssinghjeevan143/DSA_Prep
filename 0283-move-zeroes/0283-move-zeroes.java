class Solution {
    //public void moveZeroes(int[] nums) {
        //   int i = 0; // slow pointer
        //     for (int j = 0; j < nums.length; j++) { // fast pointer
        //         if (nums[j] != 0) {
        //             nums[i] = nums[j];
        //             i++;
        //         }
        //     }
        //     while (i < nums.length) {
        //         nums[i] = 0;
        //         i++;
        //     }


    public void moveZeroes(int[] nums) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }













        // int start = 0;
        
        // for(int num : nums){
        //     if(num  != 0){
        //         nums[start++] = num;
        //     }
        // }

        // while(start < nums.length){
        //     nums[start++] = 0;
        // }
    }
