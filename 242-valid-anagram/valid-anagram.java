class Solution {
    public boolean isAnagram(String s, String t) {
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    String sorted1 = new String(str1);
    String sorted2 = new String(str2);
    return sorted1.equals(sorted2);

    }
}