class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
          int ones = 0;
        int zeros = 0;
        
        for(int stud : students){
            if(stud == 0) zeros++;
            else ones++;
        }
        
        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(zeros == 0){
                    return ones;
                }
                zeros--;
            }
            else{
                if(ones == 0){
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }
}