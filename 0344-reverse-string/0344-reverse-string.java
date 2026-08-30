class Solution {
    // public void reverseString(char[] s) {
    //     reverse(s,0,s.length-1);
    // }
    // private void reverse(char[]s,int start,int end){
    //     if(start <= end){
    //         char temp = s[start];
    //         s[start] = s[end];
    //         s[end] = temp;
            
    //         reverse(s,start+1,end-1);
    //     }
    // }


    public void reverseString(char[]s){
        String str = new String(s);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for(int i = 0 ; i < s.length;i++){
           s[i] =  sb.charAt(i);
        }
    }
}