class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String x : word1) {
            str1.append(x);
        }
        for (String y : word2) {
            str2.append(y);
        }
        return (str1.toString()).equals(str2.toString());

    }
}