class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {
            //check for duplicates
            if(i != 0 && nums[i] == nums[i-1]) continue;

            for(int j = i+1; j < n; j++) {
                //check for duplicates
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int k = j + 1;
                int l = n - 1;
                while(k < l) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];

                    if(sum > target) {
                        l--;
                    }
                    else if(sum < target) {
                        k++;
                    }
                    else if(sum == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        list.add(temp);
                        k++;
                        l--;

                        //check for duplicates
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }

        return list;
    }
}