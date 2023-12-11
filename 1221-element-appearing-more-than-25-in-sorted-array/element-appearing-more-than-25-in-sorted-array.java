class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int size=n/4;
        for(int i=0;i<n-size;i++){
            if(arr[i]==arr[i+size]){
                return arr[i];
            }
        }
        return -1;
    }
}