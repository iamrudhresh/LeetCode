class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int msb = 31 - Integer.numberOfLeadingZeros(i);
            int digits = (int)(msb * 0.30103) + 1;
            if (i >= Math.pow(10, digits)) digits++;
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}