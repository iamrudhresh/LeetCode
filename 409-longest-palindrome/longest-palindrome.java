class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
         HashSet<Character> hs = new HashSet<Character>();
        if(s==null || n==0) return 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                ans++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return ans*2 + 1;
        return ans*2;
    }
}