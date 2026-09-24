class Solution {
    // public boolean isPalindrome(String s) {
   
    // int left = 0;
    // int right = s.length() - 1;

    //     while(left < right) {
    //         while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
    //             left++;
    //         }
    //         while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
    //             right--;
    //         }

    //         if(Character.toLowerCase(s.charAt(left)) != 
    //         Character.toLowerCase(s.charAt(right))) {
    //             return false;
    //         }

    //         left++;
    //         right--;
    //     }

    // return true;
    // }


    // public boolean isPalindrome(String s){

    //     int l = 0;
    //     int e = s.length() - 1;

    //     while(l < e){
    //         while(l < e && !Character.isLetterOrDigit(s.charAt(l))){
    //             l++;
    //         }
    //         while(l < e && !Character.isLetterOrDigit(s.charAt(e))){
    //             e--;
    //         }

    //         if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(e))){
    //             return false;
    //         }

    //         l++;
    //         e--;
    //     }
    //     return true;
    // }

    public boolean isPalindrome(String s){
        String str = s.toLowerCase();
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            if(Character.isLetterOrDigit(str.charAt(i))){
                rev += str.charAt(i);
            }
        }

        String forward = "";
        for(int i = 0; i < str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                forward += str.charAt(i);
            }
        }

        if(forward.equals(rev)){
            return true;
        }
        return false;
    }
}
