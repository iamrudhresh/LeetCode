class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int n=details.length; 
        for(int i=0;i<n;i++){
            int ans = Integer.parseInt(details[i].substring(11,13));
            if(ans>60){
                count++;
            }
        }
        return count;
    }
}