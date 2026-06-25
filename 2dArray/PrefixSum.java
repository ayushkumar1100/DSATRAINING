/*
Approach:
Step 1: Create a Prefix Matrix
Create another matrix prefix[][] of the same size as the original matrix.
prefix[i][j] = Sum of all elements from (0,0) to (i,j)

Step 2: Traverse Every Cell
Visit each cell row by row.
For each cell (i, j):
Start with the current element.
Add the prefix sum from the top.
Add the prefix sum from the left.
Subtract the top-left prefix because it gets counted twice.

Formula
prefix[i][j] = arr[i][j]
if (i > 0)
    prefix[i][j] += prefix[i-1][j]
if (j > 0)
    prefix[i][j] += prefix[i][j-1]
if (i > 0 && j > 0)
    prefix[i][j] -= prefix[i-1][j-1]

Why do we subtract the top-left?
    When we add:
    Top prefix, Left prefix
    the top-left region is included in both sums, so it is counted twice.
    Subtracting prefix[i-1][j-1] removes this duplicate count.


Time Complexity
Building Prefix Matrix: O(n × m)
Querying any submatrix sum: O(1)
Space Complexity
O(n × m) (for the prefix matrix)

*/

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int m = arr[0].length;

        int[][] prefix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prefix[i][j] = arr[i][j];

                if (i > 0)
                    prefix[i][j] += prefix[i - 1][j];

                if (j > 0)
                    prefix[i][j] += prefix[i][j - 1];

                if (i > 0 && j > 0)
                    prefix[i][j] -= prefix[i - 1][j - 1];
            }
        }

        for (int[] row : prefix) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}