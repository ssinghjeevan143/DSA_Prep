class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int heightt= Math.min( height[left], height[right]);
            int width = right - left;
            int area =  heightt * width;

            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}