class Solution {
    public String largestOddNumber(String num) {

        int i=num.length()-1; //length of the string

        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}