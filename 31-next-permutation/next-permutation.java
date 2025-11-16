class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        //Find the Pivot
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        //If there is no Pivot, the array is already in non-decreasing order (last permutation). So just reverse it to get the first.

        if(pivot==-1){
            reverse(nums,0,n-1);
        }
        else{
            //If pivot exists...
            for(int i=n-1; i>=0; i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
            reverse(nums, pivot+1,n-1);
        }
        
    }
    void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
