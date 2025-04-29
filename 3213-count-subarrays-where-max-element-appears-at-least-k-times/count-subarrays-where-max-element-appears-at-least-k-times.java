class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Arrays.stream(nums).max().getAsInt();
        long res = 0;
        int left = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if (mpp.getOrDefault(maxi, 0) >= k) {
                while (left < nums.length && mpp.getOrDefault(maxi, 0) >= k) {
                    mpp.put(nums[left], mpp.get(nums[left]) - 1);
                    left++;
                }
            }
            res += left;
        }
        return res;
    }
}