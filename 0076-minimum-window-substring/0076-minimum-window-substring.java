class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Dictionary to keep a count of all unique characters in t
        int[] dictT = new int[128];
        for (int i = 0; i < t.length(); i++) {
            dictT[t.charAt(i)]++;
        }

        // Number of unique characters in t that need to be present in the window
        int required = 0;
        for (int i = 0; i < 128; i++) {
            if (dictT[i] > 0) {
                required++;
            }
        }

        int l = 0, r = 0;
        int formed = 0;
        int[] windowCounts = new int[128];

        // Tuple of length, left, right to store the best window
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts[c]++;

            if (dictT[c] > 0 && windowCounts[c] == dictT[c]) {
                formed++;
            }

            // Contract the window until it ceases to be valid
            while (l <= r && formed == required) {
                char leftChar = s.charAt(l);

                // Save the smallest window
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minLeft = l;
                    minRight = r;
                }

                windowCounts[leftChar]--;
                if (dictT[leftChar] > 0 && windowCounts[leftChar] < dictT[leftChar]) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
    }
}
