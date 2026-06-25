// leetcode 73
/*
Approach:
Check whether the first column originally contains a 0 using a variable col0.
Traverse the matrix.
Whenever matrix[i][j] == 0:
Set matrix[i][0] = 0
If j != 0, set matrix[0][j] = 0
Otherwise, set col0 = 0
Traverse from the bottom-right corner.
If matrix[i][0] == 0 or matrix[0][j] == 0, set matrix[i][j] = 0.
Finally, if col0 == 0, make the first column zero.

Why col0?
The cell matrix[0][0] belongs to both the first row and the first column, so it cannot independently
 represent both. col0 is used to remember whether the first column should be zeroed.

Complexity
Time: O(m × n)
Space: O(1)

*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int col0 = 1;

        for (int i = 0; i < rows; i++) {

            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}