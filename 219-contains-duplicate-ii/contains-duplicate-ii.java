class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(k==0){
            return false;
        }
        Map <Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(hm.containsKey(num) && (i - hm.get(num)<=k)){
                return true;
            }
            hm.put(num,i);
        }
        return false;

    }
}