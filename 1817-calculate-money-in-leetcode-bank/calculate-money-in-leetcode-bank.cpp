class Solution {
public:
    int arithmeticProgression(int leading, int last, int terms){
        return (leading+last)*terms/2;
    }
    int totalMoney(int n) {
        auto [q, r]=div(n, 7);
        return arithmeticProgression(28, 28+(q-1)*7, q)+arithmeticProgression(q+1, q+r, r);
    }
};