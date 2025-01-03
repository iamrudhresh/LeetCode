class Solution {

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        // Prefix sum array to store cumulative sums
        long[] prefSum = new long[n];
        prefSum[0] = nums[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + nums[i];
        }

        int count = 0;
        // Check each possible split position
        for (int i = 0; i < n - 1; i++) {
            // Sum of left part (0 to i)
            long leftSum = prefSum[i];
            // Sum of right part (i+1 to n-1)
            long rightSum = prefSum[n - 1] - prefSum[i];

            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}