class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int x = Math.abs(nums[i]);
            if(nums[x-1]<0){
                ans.add(x);
            }
            nums[x-1]*=-1;
        }
        return ans;
    }
}