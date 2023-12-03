class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            mul=mul*dig;
            n=n/10;
        }
        return mul-sum;
    }
}