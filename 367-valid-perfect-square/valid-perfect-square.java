class Solution {
    public boolean isPerfectSquare(int num) {
        int s=(int)Math.sqrt(num);
        return (s*s)==num;
    }
}