class Solution {
    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];
        int[] fac = new int[tiles.length() + 1];
        fac[0] = 1;
        for(int i = 1; i < fac.length; i++){
            fac[i] = i * fac[i - 1];
        }
        for(int i = 0; i < tiles.length(); i++){
            counts[tiles.charAt(i) - 'A']++;
        }
        int[] lengthCounts = new int[tiles.length() + 1];
        lengthCounts[0] = 1;
        for(int i = 0; i < counts.length; i++){
            if(counts[i] != 0){
                int[] temp = new int[tiles.length() + 1];
                for(int j = 0; j < lengthCounts.length && lengthCounts[j] > 0; j++){
                    for(int k = 1; k <= counts[i]; k++){
                        int totalLength = j + k;
                        temp[totalLength] += lengthCounts[j] * fac[totalLength] / (fac[k] * fac[j]);
                    }
                }
                for(int j = 0; j < temp.length; j++){
                    lengthCounts[j] += temp[j];
                }
            }
        }
        int ans = 0;
        for(int i = 1; i < lengthCounts.length; i++){
            ans += lengthCounts[i];
        }
        return ans;
    }
}