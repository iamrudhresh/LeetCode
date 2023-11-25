class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length; //array length
        int sum=0; 
        int diff=Arrays.stream(nums).sum();
        int[] arr=new int[n];
        int i=0;
        for(int x:nums){
            arr[i]=(2*i-n)*x+diff-sum;
            sum=sum+x;
            diff=diff-x;
            i++;
        }
        return arr;
    }
}