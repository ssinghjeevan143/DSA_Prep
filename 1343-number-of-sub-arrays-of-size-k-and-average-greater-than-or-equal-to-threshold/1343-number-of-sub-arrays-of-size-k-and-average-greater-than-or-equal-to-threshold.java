class Solution {
    // public int numOfSubarrays(int[] arr, int k, int threshold) {
        
    //     int count = 0;

    //     for(int i = 0; i <= arr.length - k; i++ ){
    //         int sum = 0;
    //         for(int j = i; j < i+k;j++){
    //             sum += arr[j];
                
    //         }
    //         if(sum >= k*threshold){
    //                 count++;
    //             }
    //     }
    //     return count;
    // }

//SLIDING WINDOW APPROACH
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count = 0;
       int maxT = k * threshold;
       int sum = 0;
        for(int i = 0; i < k; i++){
            sum+=arr[i];
        }

        if(sum >= maxT){
            count++;
        }
        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i];
            sum = sum - arr[i - k];

            if(sum >= maxT){
                count++;
            }
        }
        return count;
    }
}