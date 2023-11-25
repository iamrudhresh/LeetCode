class Solution {
    public int differenceOfSums(int n, int m) {
        int odd=0;
        int even=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                even=even+i;
            }else{
                odd=odd+i;
            }
        }
        return odd-even;

    }
}