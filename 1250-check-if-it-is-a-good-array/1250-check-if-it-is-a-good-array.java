class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean isGoodArray(int[] nums) {
        int g = nums[0];
        for (int num : nums) {
            g = gcd(g, num);
            if (g == 1) return true; // early exit
        }
        return g == 1;
    }
}