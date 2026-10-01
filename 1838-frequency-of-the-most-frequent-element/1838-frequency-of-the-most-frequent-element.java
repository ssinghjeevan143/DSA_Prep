class Solution {
    // public int maxFrequency(int[] nums, int k) {
    //     int max = 0;
    //     Arrays.sort(nums);
    //     for(int i = 0; i < nums.length;i++){
    //         int sum = 0;
    //         for(int j = i; j < nums.length; j++){
    //             sum += nums[j];

    //             int total = nums[j] * (j-i+1);

    //             int x = total - sum;

    //             if(x > k){
    //                 break;
    //             }

    //             max = Math.max(max, j-i+1);
    //         }

    //     }
    //     return max;
    // }

// SLIDING WINDOW
    public int maxFrequency(int[] nums, int k){
        Arrays.sort(nums);
        long sum = 0;
        int i = 0; 
        int max = 1;
        
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            while((long)nums[j] * (j - i + 1) - sum > k){
                sum = sum - nums[i];
                i++;
            }
            max = Math.max(max, (j-i+1));
        }
        return max;
    }
}