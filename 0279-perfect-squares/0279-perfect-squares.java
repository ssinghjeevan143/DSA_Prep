import java.util.*;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Precompute squares
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        // DP transition
        for (int i = 1; i <= n; i++) {
            for (int square : squares) {
                if (i - square >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }
        return dp[n];
    }
}
