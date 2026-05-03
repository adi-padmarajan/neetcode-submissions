class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;


        int row_start = 0;
        int row_end = m - 1;
        int col_start = 0;
        int col_end = n - 1; 

        List<Integer> output = new ArrayList<>();

        while (row_start <= row_end && col_start <= col_end){

            //1 - left to right
            for(int col = col_start; col <= col_end; col++){
                output.add(matrix[row_start][col]);
            }
            row_start++;

            //2 - top to bottom
            for(int row = row_start; row <= row_end; row++){
                output.add(matrix[row][col_end]);
            }
            col_end--;

            //3 - right to left
            if (row_start <= row_end) {
                for (int col = col_end; col >= col_start; col--) {
                    output.add(matrix[row_end][col]);
                }
                row_end--;
            }

            //4 - bottom to top
            if (col_start <= col_end) {
                for (int row = row_end; row >= row_start; row--) {
                    output.add(matrix[row][col_start]);
                }
                col_start++;
            }

        }

        return output;
    }
}

/*
    check whether the bottom row and left column 
    still exist after shrinking the top row and right column.
*/
