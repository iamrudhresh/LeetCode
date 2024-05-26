class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(nums1[i] % (nums2[j]*k)==0){
                    count++;
                }
            }
        }
        return count;
    }
}