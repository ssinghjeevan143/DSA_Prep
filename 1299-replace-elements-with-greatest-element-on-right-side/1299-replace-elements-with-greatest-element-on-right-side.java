class Solution {
    public int[] replaceElements(int[] arr) {
    
        // int maxRight = -1;
        // for(int i = arr.length-1;i>=0;i--){
        //     int current = arr[i];
        //     arr[i] = maxRight;
        //     maxRight = Math.max(maxRight, current);
        // }
        // return arr;



        
        int n = arr.length;
        for(int i = 0;i < n;i++){
            int max = -1;
            for(int j = i+1; j < n; j++){
                max = Math.max(max,arr[j]);
            }
            arr[i] = max;
        }
        return arr;
    }
}