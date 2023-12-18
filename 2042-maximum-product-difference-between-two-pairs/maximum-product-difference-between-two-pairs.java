class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1]*nums[n-2];
        int b=nums[0]*nums[1];
        int sum=a-b;
        return sum;
    }
}