class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] - '0') % 2 == (arr[i + 1] - '0') % 2) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    break;
                }
            }
        }
        return new String(arr);
    }
}