import java.util.HashSet;

class Solution {

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