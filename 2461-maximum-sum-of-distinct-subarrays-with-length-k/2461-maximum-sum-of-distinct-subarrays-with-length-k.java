class Solution {
    //[1,5,4,2,9,9,9]

    public long maximumSubarraySum(int[]nums, int k){
        long max= 0,sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

            if(i >= k){
                sum -= nums[i - k];
                freq.put(nums[i-k],freq.get(nums[i-k]) - 1);
                if(freq.get(nums[i-k])== 0){
                    freq.remove(nums[i-k]);
                }
            }

            if( i >= k - 1 && freq.size() == k){
                max = Math.max(max,sum);
            }
            
        }
        return max;
    }









    // public long maximumSubarraySum(int[]nums, int k){
    //     long max = 0, sum = 0;
    //     Set<Integer>set = new HashSet<>();
    //     int n = nums.length;
    //     int left = 0;
    //     for(int right = 0; right < n; right++){
    //         while(set.contains(nums[right])){
    //             set.remove(nums[left]);
    //             sum -= nums[left];
    //             left++;
    //         }

    //         set.add(nums[right]);
    //         sum += nums[right];

    //         if(right - left + 1 == k){
    //             max = Math.max(max,sum);
    //             set.remove(nums[left]);
    //             sum -= nums[left];
    //             left++;
    //         }
    //     }
    //     return max;
    // }


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