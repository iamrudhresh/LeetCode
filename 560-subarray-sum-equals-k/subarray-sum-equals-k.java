class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int n = nums.length;
        int sum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            if(mp.containsKey(sum - k)){
                ans = ans + mp.get(sum - k);
            }

            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}