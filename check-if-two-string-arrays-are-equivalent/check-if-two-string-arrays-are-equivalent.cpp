class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string ans="";
        string res="";
        for(int i=0;i<word1.size();i++){
            ans=ans+word1[i];
        }
        for(int i=0;i<word2.size();i++){
            res=res+word2[i];
        }
        if(ans==res){
            return 1;
        }else{
            return 0;
        }
    }
};