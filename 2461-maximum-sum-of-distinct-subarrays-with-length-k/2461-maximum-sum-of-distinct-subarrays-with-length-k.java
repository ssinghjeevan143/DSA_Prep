class Solution {

    public long maximumSubarraySum(int[]nums, int k){
        long max = 0, sum = 0;
        Set<Integer>set = new HashSet<>();
        int n = nums.length;
        int left = 0;
        for(int right = 0; right < n; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if(right - left + 1 == k){
                max = Math.max(max,sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }


    // public long maximumSubarraySum(int[] nums, int k) {
    //     long max = 0;
    //     int n = nums.length;
    //     for(int i = 0; i <= n - k; i++){
    //         Set<Integer>set = new HashSet<>();
    //           long sum = 0;
    //         boolean isDuplicate = false;
    //         for(int j = i; j <= i + k - 1; j++){
    //             if(set.contains(nums[j])){
    //                 isDuplicate = true;
    //                 break;
    //             }
    //             set.add(nums[j]);
    //             sum = sum +nums[j];
    //         }
    //         if(!isDuplicate){
    //                 max = Math.max(max,sum);  
    //             }
            
    //     }
    //     return max;
    // }
}