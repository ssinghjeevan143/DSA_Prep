class Solution {
    public boolean searchMatrix(int[][]matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row;i++){
            for(int j = 0; j < col;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }





    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int nor = matrix.length;
    //     int noc = matrix[0].length;

    //     int row = 0;
    //     int col = noc - 1;

    //     while(row < nor && col >= 0){
    //         int val = matrix[row][col];

    //         if(val == target){
    //             return true;
    //         }else if(val > target){
    //             col--;
    //         }else{
    //             row++;
    //         }
    //     }

    //     return false;

    // }
}