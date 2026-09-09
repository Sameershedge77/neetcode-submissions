class Solution {
    public void setZeroes(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean firstRowZero = false;
    boolean firstColZero = false;

    // 1. Check if first row contains zero
    for (int j = 0; j < cols; j++) {
        if (matrix[0][j] == 0) {
            firstRowZero = true;
            break;
        }
    }

    // 2. Check if first column contains zero
    for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }

    // 3. Use first row and first column as markers
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {

            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // 4. Set inner cells to zero using markers
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {

            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // 5. Set first row to zero if needed
    if (firstRowZero) {
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = 0;
        }
    }

    // 6. Set first column to zero if needed
    if (firstColZero) {
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }

    }
}
