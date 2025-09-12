/**
 * @param {string} s
 * @return {boolean}
 */
var doesAliceWin = function(s) {
    const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
    for (let i = 0; i < s.length; i++) {
        if (vowels.has(s[i])) {
            return true; // Alice can always win if there’s at least one vowel
        }
    }
    return false; // No vowels → Alice cannot move
};
