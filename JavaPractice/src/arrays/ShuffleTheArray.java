package arrays;

import java.util.Arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] answerArray = shuffle(nums, n);
        System.out.println(Arrays.toString(answerArray));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] valueArray = new int[nums.length];
        for (int i = 0; i < n; i++) {
            valueArray[2 * i] = nums[i];
            valueArray[2 * i + 1] = nums[n + i];

        }
        return valueArray;
    }
}
