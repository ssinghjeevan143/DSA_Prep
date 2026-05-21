class Solution {
    public int secondHighest(String s) {
        boolean[]seen = new boolean[10];
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                seen[c - '0'] = true;
            } 
        }

        int largest = -1, second = -1;
        for (int d = 9; d >= 0; d--) {
            if (seen[d]) {
                if (largest == -1) {
                    largest = d;
                } else {
                    second = d;
                    break;
                }
            }
        }
        return second;
    }

 
}