class Solution {
    // public int[] sortedSquares(int[] nums) {
    //     int n = nums.length;
    //     int[] squared = new int[n];
        
    //     // Step 1: Square each element
    //     for (int i = 0; i < n; i++) {
    //         squared[i] = nums[i] * nums[i];
    //     }
        
    //     // Step 2: Sort the squared array
    //     Arrays.sort(squared);
    //     return squared;
    // }

    public int[] sortedSquares(int[]nums){
        
        int [] result = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = nums.length - 1;
        while(i <= j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                result[k] = nums[i] * nums[i];
                i++;
            }else{
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}