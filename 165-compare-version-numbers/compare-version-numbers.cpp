class Solution {
public:
    short compareVersion(string& version1, string& version2) {
        string p1{},p2{};
        short ptr1{},ptr2{};
        int num_p1,num_p2;
        while(ptr1<version1.size()&&ptr2<version2.size()){
            while(ptr1<version1.size()&&version1[ptr1]!='.') 
                p1.push_back(version1[ptr1++]);
            
            while(ptr2<version2.size()&&version2[ptr2]!='.') 
                p2.push_back(version2[ptr2++]);
            
            if(p1.size()>0)
                num_p1=stoi(p1);
            if(p2.size()>0)
                num_p2=stoi(p2);
            if(num_p1>num_p2) return 1;
            else if(num_p2>num_p1) return -1;
            p1=""; ptr1++;
            p2=""; ptr2++;
        }
        while(ptr1<version1.size()){
            if(version1[ptr1]!='.'&&version1[ptr1]>'0') 
                return 1;
            ptr1++;
        }
        while(ptr2<version2.size()){
            if(version2[ptr2]!='.'&&version2[ptr2]>'0') 
                return -1;
            ptr2++;
        }
        return 0;
    }
};