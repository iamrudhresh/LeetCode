class Solution {

    private boolean dfs(final char[][] b, final String w, final int r, final int c, final int ind, final boolean[][] v) {
        if (ind == w.length()) return true;
        if(r < 0 || c <0 || r >= b.length || c >= b[0].length || v[r][c] || b[r][c] != w.charAt(ind)) return false;
        v[r][c] = true;
        boolean b2 = dfs(b, w, r + 1, c, ind + 1, v) || dfs(b, w, r - 1, c, ind + 1, v) || dfs(b, w, r, c - 1, ind + 1, v) || dfs(b, w, r, c + 1, ind + 1, v);
        if(!b2) v[r][c] = false;
        return b2;
    }

    public boolean exist(char[][] board, String word) {
        final int m = board.length, n = board[0].length;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if(dfs(board, word, i, j, 0, new boolean[m][n])) return true;
            }
        }
        return false;
    }
}