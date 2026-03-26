class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squared = new int[n];
        
        // Step 1: Square each element
        for (int i = 0; i < n; i++) {
            squared[i] = nums[i] * nums[i];
        }
        
        // Step 2: Sort the squared array
        Arrays.sort(squared);
        return squared;
    }
}