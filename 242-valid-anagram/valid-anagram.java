class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s2);
        Arrays.sort(s1);
        String str1=new String(s1);
        String str2=new String(s2);
        return str1.equals(str2);
    }
}