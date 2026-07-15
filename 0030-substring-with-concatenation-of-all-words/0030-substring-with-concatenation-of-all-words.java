class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        // Try each offset
        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset, right = offset;
            Map<String, Integer> seen = new HashMap<>();
            int matched = 0;

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (count.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) <= count.get(word)) {
                        matched++;
                    } else {
                        // shrink until valid
                        while (seen.get(word) > count.get(word)) {
                            String leftWord = s.substring(left, left + wordLen);
                            seen.put(leftWord, seen.get(leftWord) - 1);
                            if (seen.get(leftWord) < count.get(leftWord)) matched--;
                            left += wordLen;
                        }
                    }

                    if (matched == words.length) {
                        result.add(left);
                        // shrink one word
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        matched--;
                        left += wordLen;
                    }
                } else {
                    // reset window
                    seen.clear();
                    matched = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}
