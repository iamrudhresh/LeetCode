/**
 * @param {number[][]} points
 * @return {number}
 */
var countTrapezoids = function(points) {
    const MOD = 1000000007n;
    const cnt = new Map();
    for (const p of points) {
        const y = p[1];
        cnt.set(y, (cnt.get(y) || 0n) + 1n);
    }
    const seg = [];
    for (const k of cnt.values()) {
        if (k >= 2n) seg.push(k * (k - 1n) / 2n);
    }
    let sum = 0n, ans = 0n;
    for (const v of seg) {
        ans = (ans + v * sum) % MOD;
        sum = (sum + v) % MOD;
    }
    return Number(ans);
};