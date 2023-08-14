package arrays;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][]ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] AT = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j<n ; j++) {
                AT[i][j]= matrix[j][i];
            }
        }
        return AT;
    }
}
