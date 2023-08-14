package arrays;

import java.util.Arrays;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */
public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                arr[row][col] = image[row][(image[row].length - 1) - col];
                if (arr[row][col] == 0) {
                    arr[row][col] = 1;
                } else arr[row][col] = 0;
            }
        }
        return arr;
    }
}

