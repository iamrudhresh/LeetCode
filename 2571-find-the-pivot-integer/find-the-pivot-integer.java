class Solution {
    public int pivotInteger(int n) {
        int sum=(n*(n+1))/2;
        int pivot=(int)Math.sqrt(sum);
        return (sum==pivot*pivot)?pivot:-1;
    }
}