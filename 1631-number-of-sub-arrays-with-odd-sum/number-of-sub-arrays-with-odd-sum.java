class Solution {

    public int numOfSubarrays(int[] arr) {
        int MOD = (int) Math.pow(10, 9) + 7;
        int n = arr.length;

        // Convert elements to 0 (even) or 1 (odd)
        for (int num = 0; num < n; num++) {
            arr[num] %= 2;
        }

        int[] dpEven = new int[n], dpOdd = new int[n];

        // Initialization based on the last element
        // The last element is even
        if (arr[n - 1] == 0) dpEven[n - 1] = 1;
        else dpOdd[n - 1] = 1; // The last element is odd

        for (int num = n - 2; num >= 0; num--) {
            if (arr[num] == 1) {
                // Odd element contributes to odd subarrays
                dpOdd[num] = (1 + dpEven[num + 1]) % MOD;
                // Even element continues the pattern
                dpEven[num] = dpOdd[num + 1];
            } else {
                // Even element contributes to even subarrays
                dpEven[num] = (1 + dpEven[num + 1]) % MOD;
                // Odd element continues the pattern
                dpOdd[num] = dpOdd[num + 1];
            }
        }

        // Sum all the odd subarrays
        int count = 0;
        for (int oddCount : dpOdd) {
            count += oddCount;
            count %= MOD;
        }
        return count;
    }
}