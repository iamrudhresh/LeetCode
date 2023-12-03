class Solution {
    public double average(int[] salary) {
        int sum=0;
        int tot=salary.length-2;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
        }
        return (double)sum/tot;
    }
}