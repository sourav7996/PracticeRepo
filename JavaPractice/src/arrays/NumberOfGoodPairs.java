package arrays;

/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
