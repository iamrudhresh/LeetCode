class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        //create copy of nums array with double length
        int[] concat =Arrays.copyOf(nums,n*2);
        System.arraycopy(nums,0,concat,n,n);
        //return concat array
        return concat;
    }
}