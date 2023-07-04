class Solution {
public:
    bool detectCapitalUse(string word) {
        int caps=0;
        int small=0;
        for(int i=0;i<word.size();i++){
            if(isupper(word[i])){
                caps++;
            }else{
                small++;
            }
        }
        if(caps==0 or small==0){
            return true;
        }
        if(caps==1){
            if(isupper(word[0])){
                return true;
            }
        }
        return false;
    }
};