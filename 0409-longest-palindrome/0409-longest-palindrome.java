import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII letters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // use even part
                oddFound = true;
            }
        }

        if (oddFound) length += 1; // one odd char in center
        return length;
    }
}
