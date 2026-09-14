import java.util.HashSet;

class Solution {
    //BRUTE FORCE APPROACH
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i+1; j < nums.length;j++){
    //             if(nums[i] == nums[j] && Math.abs(i - j) <= k){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int right = 0; right < nums.length; right++) {

            // duplicate found
            if(set.contains(nums[right])) {
                return true;
            }

            set.add(nums[right]);

            // maintain window size k
            if(set.size() > k) {

                set.remove(nums[right - k]);
            }
        }

        return false;
    }
}