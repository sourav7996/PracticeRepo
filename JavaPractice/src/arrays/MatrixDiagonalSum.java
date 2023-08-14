package arrays;

import java.util.Arrays;

/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
Example:           index-->        0 1 2 3
                     |         0 [[1,2,3,4],      sum=1+4+7+1+4+5+6+7=35.
                     V         1  [3,4,5,6],
                               2  [5.6.7.8],
                               3  [7.8.9.1]]
 */
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat= {{2,4,6,7,9},
                      {1,2,3,8,7},
                      {3,2,7,6,3},
                      {4,6,9,5,1},
                      {5,1,2,4,2}};
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int mid = n/2;
        for (int row = 0; row < n; row++) {
            sum+=mat[row][row];
            sum+=mat[row][n-1-row];
        }
        if(n%2==1){
            sum-=mat[mid][mid];
        }

        return sum;
    }
}
