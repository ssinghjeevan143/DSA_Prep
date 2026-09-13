class Solution {
//sliding window pattern
public int minSubArrayLen(int target, int[]nums){
    int size = Integer.MAX_VALUE;
    int sum = 0;
    int i = 0;
    int j = 0;
    while(j < nums.length){
        sum += nums[j];

        while(sum >= target){
            size = Math.min(size, j - i+1);
            sum -= nums[i];
            i++;
        }
        j++;
    }
    return size == Integer.MAX_VALUE ? 0 : size;
}




// // brute force  TC: O(n^2)
//     public int minSubArrayLen(int target, int[]nums){
//         int size = Integer.MAX_VALUE;
//         int sum = 0;
//         for(int i = 0; i < nums.length;i++){
//              sum = 0;
//             for(int j = i; j < nums.length; j++){
//                 sum += nums[j];
//                 if(sum >= target){
//                     size = Math.min(size, j - i + 1);
//                     break;
//                 }
                
//             }
//         }
//         return size == Integer.MAX_VALUE ? 0 : size;
//     }

    // public int minSubArrayLen(int target, int[] nums) {
    //     int sum = 0;
    //     int minLength = Integer.MAX_VALUE;
    //     int i = 0;
    //     for(int j = 0; j < nums.length; j++){
    //         sum += nums[j];

    //         while(sum >= target){
    //             minLength = Math.min(minLength, j-i +1);
    //             sum -= nums[i];
    //             i++;
    //         }
    //     }
    //     return minLength == Integer.MAX_VALUE ? 0 : minLength;
    // }
}