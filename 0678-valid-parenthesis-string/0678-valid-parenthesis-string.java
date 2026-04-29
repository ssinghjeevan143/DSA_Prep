class Solution {
    public boolean checkValidString(String s) {
        int i = 0, j = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                i++;
                j++;
            }else if(c == ')'){
                i--;
                j--;
            }else{
                i--;
                j++;
            }
            if(j < 0) return false;
            if(i < 0) i = 0;

        }
        return i == 0;
    }
}