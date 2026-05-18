class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        // 32-bit integer → max 8 hex digits
        while (num != 0 && sb.length() < 8) {
            int digit = num & 0xf; // last 4 bits
            sb.append(hexChars[digit]);
            num >>>= 4; // unsigned right shift
        }

        return sb.reverse().toString();
    }
}
