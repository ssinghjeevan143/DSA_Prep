class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nor = matrix.length;
        int noc = matrix[0].length;

        int row = 0;
        int col = noc - 1;

        while(row < nor && col >= 0){
            int val = matrix[row][col];

            if(val == target){
                return true;
            }else if(val > target){
                col--;
            }else{
                row++;
            }
        }

        return false;

    }
}