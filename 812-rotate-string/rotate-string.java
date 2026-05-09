class Solution {

    public boolean rotateString(String s, String goal) {

        // lengths must be same
        if(s.length() != goal.length()) {
            return false;
        }

        String current = s;

        // try all rotations
        for(int i = 0; i < s.length(); i++) {

            
            // rotate once
            current = current.substring(1) + current.charAt(0);
            
            // check match
            if(current.equals(goal)) {
                return true;
            }

        }

        return false;
    }
}