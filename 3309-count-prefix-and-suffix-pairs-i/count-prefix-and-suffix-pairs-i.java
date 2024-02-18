class Solution {
    public static boolean isPrefixAndSuffix(String str1, String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}