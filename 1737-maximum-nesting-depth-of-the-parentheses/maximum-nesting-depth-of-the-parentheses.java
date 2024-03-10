class Solution {
    public int maxDepth(String s) {
        int maxi =0;
        int depth = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                depth++;
                maxi = Math.max(depth,maxi);
            }else if(c==')'){
                depth--;
            }
        }
        return maxi;
    }
}