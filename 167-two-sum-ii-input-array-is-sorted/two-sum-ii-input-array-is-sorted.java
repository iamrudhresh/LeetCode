class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                if(numbers[i-1]+numbers[j]==target){
                    return new int[]{i,j+1};
                }
            }
        }
        return new int[]{};
    }
}