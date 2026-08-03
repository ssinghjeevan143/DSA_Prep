class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        
        // Try all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }
    
    // Check if substring is nice
    private boolean isNice(String sub) {
        int lower = 0, upper = 0;
        for (char c : sub.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower |= 1 << (c - 'a');
            } else {
                upper |= 1 << (c - 'A');
            }
        }
        return lower == upper;
    }
}
