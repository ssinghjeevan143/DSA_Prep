class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum = 0;
       double max = 0;
       for(int i = 0; i < k; i++){
        sum += nums[i];
       }
       max = sum;
    
        for(int i = k ; i < nums.length;i++){
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }
        
        
        return max/k;
    }



// BRUTE FORCE APPROACH
    // public double findMaxAverage(int[] nums, int k) {
    //     double maxAvg = Double.NEGATIVE_INFINITY; 
    //     for(int i =0; i <= nums.length - k; i++){
    //         int sum = 0;
    //         for(int j = i; j < i+ k; j++){
    //             sum += nums[j];
    //         }
    //         double avg = (double)sum/k;
    //         maxAvg = Math.max(avg,maxAvg);
    //     }
    //     return maxAvg;
    // }
}
