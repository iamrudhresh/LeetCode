class Solution {
    private void solve(char[] s) {
        int l = s.length - 1, r = s.length - 1;
        while (l >= 0) {
            if (s[l] == '.') {
                l--;
            } else if (s[l] == '#') {
                if (s[r] == '.') {
                    char temp = s[r];
                    s[r] = s[l];
                    s[l] = temp;
                }
                r--;
                l--;
            } else if (s[l] == '*') {
                l--;
                r = l;
            }
        }
    }

    public char[][] rotateTheBox(char[][] box) {
        for (int row = 0; row < box.length; row++) {
            solve(box[row]);
        }

        int m = box.length, n = box[0].length;
        char[][] ans = new char[n][m];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                ans[col][m - row - 1] = box[row][col];
            }
        }

        return ans;
    }
}