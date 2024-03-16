class Solution {
    public int finalValueAfterOperations(String[] oper) {
        int result = 0;
        for (String x : oper) {
            if (x.charAt(1) == '-') {
                result--;
            } else {
                result++;
            }
        }
        return result;
    }
}