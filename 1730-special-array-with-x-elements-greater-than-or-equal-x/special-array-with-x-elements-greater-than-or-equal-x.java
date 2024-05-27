class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];

        for(int i=0;i<n;i++){
            arr[Math.min(n,nums[i])]++;
        }

        int ans = 0;
        for(int i=n;i>=0;i--){
            ans = ans + arr[i];
            if(i == ans){
                return i;
            }
        }
        return -1;
    }
}