class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int tot= ((n-i)*(i+1)+1)/2;
            sum = sum + tot*arr[i];
        }
        return sum;
    }
}