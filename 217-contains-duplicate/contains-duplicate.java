class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num:nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
}