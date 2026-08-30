class Solution {

  public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    public void reverse(char[]arr,int s,int e){
        if(s >= e)return;

        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr,s+1, e-1);
    }
}