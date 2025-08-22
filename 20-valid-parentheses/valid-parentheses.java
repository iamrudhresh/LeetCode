class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> mp = new HashMap<>();

        mp.put(')', '(');
        mp.put('}','{');
        mp.put(']','[');

        for(char c: s.toCharArray()){
            if(mp.containsValue(c)){
                st.push(c);
            }else if(mp.containsKey(c)){
                if(st.isEmpty() || mp.get(c)!=st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}