class Solution {
    public int lengthOfLastWord(String s) {
        int c = 0;
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                c++;
            }else if(c!=0){
                break;
            }
        }
        return c;
    }
}