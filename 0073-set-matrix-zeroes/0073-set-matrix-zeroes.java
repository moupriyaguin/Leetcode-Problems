class Solution {
    public void setZeroes(int[][] matrix) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]
        int col0 = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    // set i-th row as 0;
                    matrix[i][0] = 0;
                    //set j-th column as 0
                    if(j!=0)
                    matrix[0][j] = 0;
                    else
                    col0 = 0;
                }
            }
        }
        //now set the values according to first row and first column
        //we start from i=1 and j=1
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                //if the i-th value in the first column is 0 or 
                //if the j-th value in the first row is 0 then set 0
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0;j<matrix[0].length;j++) matrix[0][j] = 0;
        }
        if(col0 == 0){
            for(int i=0;i<matrix.length;i++) matrix[i][0] = 0;
        }
    }
}