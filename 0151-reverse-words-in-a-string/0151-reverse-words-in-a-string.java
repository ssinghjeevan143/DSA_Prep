class Solution {
    public String reverseWords(String s){
        String[]words = s.trim().split("\\s+");
        int i = 0; int j = words.length - 1;
        while(i < j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",words);
    }


    

    // public String reverseWords(String s) {
    //     String[]words = s.trim().split("\\s+");
    //     StringBuilder sb = new StringBuilder();
    //     for(int i = words.length-1;i >= 0;i--){
    //         sb.append(words[i]);
    //         if(i != 0){
    //             sb.append(" ");
    //         }
    //     }
    //     return sb.toString();
    // }
}