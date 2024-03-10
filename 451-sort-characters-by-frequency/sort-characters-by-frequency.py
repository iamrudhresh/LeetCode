class Solution:
    def frequencySort(self, s: str) -> str:
        char_count = Counter(s)
        sorted_chars = sorted(char_count, key=char_count.get, reverse=True)
        res= ''
        for char in sorted_chars:
            res = res + (char * char_count[char])
        return res