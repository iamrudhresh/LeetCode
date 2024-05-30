class Solution {
    public int countTriplets(int[] A) {
        int n = A.length, res = 0, prefix = 0, c, t;
        Map<Integer, Integer> count = new HashMap<>(), total = new HashMap<>();
        count.put(0, 1);
        for (int i = 0; i < n; ++i) {
            prefix ^= A[i];
            c = count.getOrDefault(prefix, 0);
            t = total.getOrDefault(prefix, 0);
            res += c * i - t;
            count.put(prefix, c + 1);
            total.put(prefix, t + i + 1);
        }
        return res;
    }
}