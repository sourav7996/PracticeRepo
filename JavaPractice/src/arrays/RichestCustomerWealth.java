package arrays;

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 2, 1}};
        int output = maximumWealth(accounts);
        System.out.println(output);
    }

    static int maximumWealth(int[][] accounts) {
        int output = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (output < sum) {
                output = sum;
            }
        }

        return output;
    }
}
