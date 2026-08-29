class Solution {
    public int climbStairs(int n) {
        //using iterative dp
        if (n <= 2) return n;

        int prev2 = 1; // f(n-2)
        int prev1 = 2; // f(n-1)

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;


        //using recursion;
        // if(n == 1) return 1;
        // if(n == 2) return 2;
        // return climbStairs(n-1) + climbStairs(n-2);
    }
}