/*
Approach:
Step 1: Initialize Boundaries
startRow = 0
endRow = rows - 1
startColumn = 0
endColumn = cols - 1

Step 2: Repeat while boundaries are valid
startRow <= endRow
AND
startColumn <= endColumn

Step 3: Traverse the Top Row
Move left → right
(startRow, startColumn) → (startRow, endColumn)

Step 4: Traverse the Right Column
Move top → bottom
(startRow + 1, endColumn) → (endRow, endColumn)

Step 5: Traverse the Bottom Row
Move right → left
(endRow, endColumn - 1) → (endRow, startColumn)
Before printing, check:
if(startRow == endRow)
    break;
This avoids printing the same row twice when only one row remains.

Step 6: Traverse the Left Column
Move bottom → top
(endRow - 1, startColumn) → (startRow + 1, startColumn)
Before printing, check:
if(startColumn == endColumn)
    break;
This avoids printing the same column twice when only one column remains.

Step 7: Move to the Inner Layer
startRow++
startColumn++
endRow--
endColumn--
Repeat until all layers are processed.

Time Complexity: O(rows × cols)
Space Complexity: O(1)

*/
public class SpiralMatrix{
    public static void printSpiral(int[][] matrix){
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while(startRow<=endRow && startColumn<=endColumn){
            // top
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }
            // bottom
            for(int j = endColumn-1;j>=startColumn;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(arr);
    }
}