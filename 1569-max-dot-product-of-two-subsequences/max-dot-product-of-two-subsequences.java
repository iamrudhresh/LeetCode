import java.util.*;

class Solution {
    int[] nums1, nums2;
    int[][] memo;
    int n, m;
    final int NEG_INF = (int) -1e9;

    int dp(int i, int j) {
        if (i == n || j == m)
            return NEG_INF;

        if (memo[i][j] != Integer.MIN_VALUE)
            return memo[i][j];

        int take = nums1[i] * nums2[j];

        int res = Math.max(
            Math.max(
                take + dp(i + 1, j + 1), // take both and continue
                take                    // take and end here
            ),
            Math.max(
                dp(i + 1, j),           // skip nums1[i]
                dp(i, j + 1)            // skip nums2[j]
            )
        );

        return memo[i][j] = res;
    }

    public int maxDotProduct(int[] a, int[] b) {
        nums1 = a;
        nums2 = b;
        n = nums1.length;
        m = nums2.length;

        memo = new int[n][m];
        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i], Integer.MIN_VALUE);

        return dp(0, 0);
    }
}