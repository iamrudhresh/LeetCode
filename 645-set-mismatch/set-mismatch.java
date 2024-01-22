class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Set<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int sum=0;
        for(int x:hs){
            sum=sum+x;
        }
        int ans=n*(n+1)/2;
        int miss=ans-sum;

        //finding the repeated numbers in a array
        int rep=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    rep=nums[j];
                }
            }
        }
        return new int[]{rep,miss};
    }
}