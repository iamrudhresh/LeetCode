class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> one = new HashMap<>();
        int n = nums.length;
        for(int num:nums){
            one.put(num, one.getOrDefault(num,0)+1);
        }
         for (Map.Entry<Integer, Integer> entry : one.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
         }
         return -1;

    }
}