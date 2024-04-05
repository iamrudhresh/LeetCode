class Solution {
    public String convertToTitle(int c) {
        StringBuilder sol = new StringBuilder();
        while (c > 0) {
            int temp = (c - 1) % 26; 
            sol.append((char) ('A' + temp));
            c = (c - 1) / 26;
        }
        return sol.reverse().toString(); 
    }
}