import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0;

        while (i < n) {
            int lettersCount = words[i].length();
            int j = i + 1;
            int space = 0;

            // Greedy packing of words
            while (j < n && lettersCount + words[j].length() + space + 1 <= maxWidth) {
                lettersCount += words[j].length();
                space++;
                j++;
            }

            int remainSpace = maxWidth - lettersCount;
            int eachSpace = (space == 0) ? 0 : remainSpace / space;
            int extraSpace = (space == 0) ? 0 : remainSpace % space;

            StringBuilder sb = new StringBuilder();

            // Last line 
            if (j == n || space == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                // Distribute spaces evenly
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < eachSpace; s++) sb.append(" ");
                        if (extraSpace > 0) {
                            sb.append(" ");
                            extraSpace--;
                        }
                    }
                }
            }

            result.add(sb.toString());
            i = j;
        }

        return result;
    }

}
