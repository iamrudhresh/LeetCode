class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            String str = Integer.toString(num);
            int len = str.length();

            if (len % 2 != 0) continue;

            int half = len / 2;
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < half; i++) {
                leftSum += str.charAt(i) - '0';
            }

            for (int i = half; i < len; i++) {
                rightSum += str.charAt(i) - '0';
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;
    }
}
