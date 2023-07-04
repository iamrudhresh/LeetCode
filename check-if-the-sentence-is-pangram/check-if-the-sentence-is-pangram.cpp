class Solution {
public:
    bool checkIfPangram(string sentence) {
        for(char i='a';i<='z';i++){
            if(sentence.find(i)==string::npos){
                return false;
            }
        }
        return true;
        
    }
};