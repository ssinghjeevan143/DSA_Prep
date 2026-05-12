import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            // Find closest smaller or equal
            Long floor = set.floor(num);
            if (floor != null && num - floor <= valueDiff) {
                return true;
            }

            // Find closest larger or equal
            Long ceil = set.ceiling(num);
            if (ceil != null && ceil - num <= valueDiff) {
                return true;
            }

            set.add(num);

            // Maintain window size
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
