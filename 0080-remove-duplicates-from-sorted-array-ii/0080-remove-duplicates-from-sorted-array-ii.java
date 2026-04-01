class Solution {
    // public int removeDuplicates(int[] nums) {
    //     int i = 0; // pointer for placement
    //     for (int n : nums) {
    //         if (i < 2 || n != nums[i - 2]) {
    //             nums[i] = n;
    //             i++;
    //         }
    //     }
    //     return i;

    // }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; 
        
        int i = 2; // slow pointer starts at index 2
        for (int j = 2; j < n; j++) { // fast pointer scans
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; 
    }
}

