class Solution {
    public long[] countBlackBlocks(int m, int n, int[][] coordinates) {
        HashMap<Long, Integer> cnt = new HashMap<>();
        long[] res = {(n - 1L) * (m - 1), 0, 0, 0, 0};
        for (int[] c : coordinates)
            for (int i = c[0]; i < c[0] + 2; i++)
                for (int j = c[1]; j < c[1] + 2; j++)
                    if (0 < i && i < m && 0 < j && j < n) {
                        long idx = i * 100000L + j;
                        res[cnt.getOrDefault(idx, 0)]--;
                        cnt.put(idx, cnt.getOrDefault(idx, 0) + 1);
                        res[cnt.getOrDefault(idx, 0)]++;
                    }
        return res;
    }
}