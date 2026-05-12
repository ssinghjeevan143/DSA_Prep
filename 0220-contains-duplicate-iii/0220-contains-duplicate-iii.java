import java.util.*;

class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums,
                                                 int indexDiff,
                                                 int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            long current = nums[i];

            // Find smallest number >= current - valueDiff
            Long candidate = set.ceiling(current - valueDiff);

            // Check if candidate is within range
            if (candidate != null &&
                candidate <= current + valueDiff) {

                return true;
            }

            set.add(current);

            // Maintain sliding window size
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}