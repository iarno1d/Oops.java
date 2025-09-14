package Array;
public class MatrixOperations {
    
    // Add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    
    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static boolean areMatricesEqual(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Lower triangular matrix
    public static int[][] lowerTriangular(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }
    
    // Upper triangular matrix
    public static int[][] upperTriangular(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }

    public static void findFrequency(int[][] matrix) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void matrixSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i+1) + ": " + rowSum);
        }
        
        // Column sums
        System.out.println("Column sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j+1) + ": " + colSum);
        }
    }

    public static int[][] matrixTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSparseMatrix(int[][] matrix) {
        int totalElements = matrix.length * matrix[0].length;
        int zeroCount = 0;
        
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == 0) {
                    zeroCount++;
                }
            }
        }
        
        return zeroCount > totalElements / 2;
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    // Main function for testing and debugging
    public static void main(String[] args) {
        // Test matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] identityMatrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        int[][] sparseMatrix = {
            {0, 0, 1},
            {0, 2, 0},
            {3, 0, 0}
        };

        System.out.println("=== Matrix Operations Test ===\n");
        
        // Test matrix addition
        System.out.println("Matrix A + Matrix B:");
        int[][] sum = addMatrices(matrixA, matrixB);
        printMatrix(sum);
        System.out.println();
        
        // Test matrix subtraction
        System.out.println("Matrix A - Matrix B:");
        int[][] difference = subtractMatrices(matrixA, matrixB);
        printMatrix(difference);
        System.out.println();
        
        // Test matrix multiplication
        System.out.println("Matrix A * Matrix B:");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        printMatrix(product);
        System.out.println();
        
        // Test matrix equality
        System.out.println("Are Matrix A and Matrix B equal? " + areMatricesEqual(matrixA, matrixB));
        System.out.println("Are Matrix A and Matrix A equal? " + areMatricesEqual(matrixA, matrixA));
        System.out.println();
        
        // Test lower triangular
        System.out.println("Lower triangular of Matrix A:");
        int[][] lower = lowerTriangular(matrixA);
        printMatrix(lower);
        System.out.println();
        
        // Test upper triangular
        System.out.println("Upper triangular of Matrix A:");
        int[][] upper = upperTriangular(matrixA);
        printMatrix(upper);
        System.out.println();
        
        // Test frequency of odd/even numbers
        System.out.println("Frequency of odd/even in Matrix A:");
        findFrequency(matrixA);
        System.out.println();
        
        // Test row and column sums
        System.out.println("Row and column sums of Matrix A:");
        matrixSum(matrixA);
        System.out.println();
        
        // Test matrix transpose
        System.out.println("Transpose of Matrix A:");
        int[][] transpose = matrixTranspose(matrixA);
        printMatrix(transpose);
        System.out.println();
        
        // Test identity matrix check
        System.out.println("Is identity matrix an identity? " + isIdentityMatrix(identityMatrix));
        System.out.println("Is Matrix A an identity? " + isIdentityMatrix(matrixA));
        System.out.println();
        
        // Test sparse matrix check
        System.out.println("Is sparse matrix sparse? " + isSparseMatrix(sparseMatrix));
        System.out.println("Is Matrix A sparse? " + isSparseMatrix(matrixA));
        System.out.println();
        
        // Debug: Test with edge cases
        System.out.println("=== Edge Case Tests ===");
        
        // Empty matrix
        int[][] emptyMatrix = {};
        System.out.println("Testing empty matrix...");
        try {
            addMatrices(emptyMatrix, emptyMatrix);
        } catch (Exception e) {
            System.out.println("Error with empty matrix: " + e.getMessage());
        }
        
        // Single element matrix
        int[][] singleMatrix = {{5}};
        System.out.println("Single element matrix operations:");
        System.out.println("Add: " + addMatrices(singleMatrix, singleMatrix)[0][0]);
        System.out.println("Is identity? " + isIdentityMatrix(new int[][]{{1}}));
    }
}