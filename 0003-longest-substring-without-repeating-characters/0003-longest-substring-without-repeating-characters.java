class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length();right++){
            char c = s.charAt(right);
            if(lastIndex[c] >= left){
                left = lastIndex[c] + 1;
            }
            lastIndex[c] = right;
            maxLen = Math.max(maxLen, right-left + 1);
        }
        return maxLen;
    }









    // public int lengthOfLongestSubstring(String s) {
    //    HashSet<Character>set = new HashSet<>();
    //    int i = 0;
    //    int maxLen = 0;
    //    for(int j = 0; j < s.length(); j++){
    //         while(set.contains(s.charAt(j))){
    //             set.remove(s.charAt(i));
    //             i++;
    //         }
    //         set.add(s.charAt(j));
    //         maxLen = Math.max(maxLen, j - i +1);
    //    }
    //    return maxLen;
    // }
}


