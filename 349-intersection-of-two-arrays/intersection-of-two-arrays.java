class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1 = new HashSet<>();
        Set<Integer>s2 = new HashSet<>();
        for(Integer x:nums1){
            s1.add(x);
        }
        for(Integer x:nums2){
            s2.add(x);
        }
        s1.retainAll(s2);
        int index = 0;
        int n = s1.size();
        int arr[]=new int[n];
        for(int x:s1){
            arr[index++]=x;
        }
        return arr;
    }
}