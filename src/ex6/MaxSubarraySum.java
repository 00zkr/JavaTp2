package ex6;

public class MaxSubarraySum {

    public static int maxSubarraySum(int[] t) {
        int currentSum = t[0];
        int maxSum = t[0];
        for (int i = 1; i < t.length; i++) {
            currentSum = Math.max(t[i], currentSum + t[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {-2, 1, -3, 4, -1, 2, 1, -5, 4},
            {1, 2, 3, 4},
            {-1, -2, -3},
            {5},
            {-7},
            {-2, -1, 3, 4, -5},
            {1, -1, 1, -1, 1}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test #" + (i+1) + ": " + maxSubarraySum(tests[i]));
        }
    }
}
