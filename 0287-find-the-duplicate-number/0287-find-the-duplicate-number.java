class Solution {
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     int left = 0;
    //     int right = nums.length-1;
    //     while(left < right){
    //         if(nums[left] == nums[left+1]){
    //             return nums[left];
    //         }
    //         if(nums[right] == nums[right-1]){
    //             return nums[right];
    //         }
    //         left++;
    //         right--;
    //     }
    //     return -1;
    // }


    public int findDuplicate(int[]nums){
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);


        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        
    }
}