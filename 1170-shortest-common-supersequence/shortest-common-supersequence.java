class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        // Step 1: Find the longest common subsequence using dynamic programming
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        
        // Fill the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Step 2: Construct the shortest common supersequence
        // Start from the bottom right of the dp table
        int i = m, j = n;
        StringBuilder result = new StringBuilder();
        
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                // If the characters are the same, add it once
                result.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                // If coming from top has higher value, take character from str1
                result.append(str1.charAt(i - 1));
                i--;
            } else {
                // Otherwise, take character from str2
                result.append(str2.charAt(j - 1));
                j--;
            }
        }
        
        // Add remaining characters from str1 (if any)
        while (i > 0) {
            result.append(str1.charAt(i - 1));
            i--;
        }
        
        // Add remaining characters from str2 (if any)
        while (j > 0) {
            result.append(str2.charAt(j - 1));
            j--;
        }
        
        // Reverse the result to get the final supersequence
        return result.reverse().toString();
    }
}