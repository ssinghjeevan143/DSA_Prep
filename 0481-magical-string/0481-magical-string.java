class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1; // "122" has only one '1' in first 3 chars

        int[] s = new int[n + 2]; // store digits as int
        s[0] = 1; s[1] = 2; s[2] = 2;

        int head = 2;   // pointer to read group lengths
        int tail = 3;   // next position to write
        int num = 1;    // next number to append (alternates between 1 and 2)
        int countOnes = 1; // already have one '1' in "122"

        while (tail < n) {
            for (int i = 0; i < s[head]; i++) {
                s[tail] = num;
                if (num == 1 && tail < n) countOnes++;
                tail++;
            }
            num = 3 - num; // flip between 1 and 2
            head++;
        }

        return countOnes;
    }
}