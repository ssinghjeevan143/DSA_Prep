class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     int[]lastIndex = new int[256];
    //     Arrays.fill(lastIndex, -1);
    //     int left = 0;
    //     int maxLen = 0;
    //     for(int right = 0; right < s.length();right++){
    //         char c = s.charAt(right);
    //         if(lastIndex[c] >= left){
    //             left = lastIndex[c] + 1;
    //         }
    //         lastIndex[c] = right;
    //         maxLen = Math.max(maxLen, right-left + 1);
    //     }
    //     return maxLen;
    // }


//BRUTE FORCE APPROACH
    // public int lengthOfLongestSubstring(String s){
    //     int max = 0;
    //     for(int i = 0; i < s.length();i++){
            
    //         Set<Character>set = new HashSet<>();
    //         for(int j = i; j < s.length();j++){
    //             char c = s.charAt(j);
    //             if(set.contains(s.charAt(j))) break;

    //             set.add(c);
    //             max = Math.max(max, j-i+1);
    //         }
            
    //     }
    //     return max;
    // }



    //SLIDING WINDOW APPROACH
    public int lengthOfLongestSubstring(String s){
        int max = 0; 
        int i = 0;
        int j = 0;
        Set<Character>set = new HashSet<>();
        while(j < s.length()){
            char c = s.charAt(j);

            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(c);
            max = Math.max(max, j - i + 1);

            j++;
        }
        return max;
    }

}


