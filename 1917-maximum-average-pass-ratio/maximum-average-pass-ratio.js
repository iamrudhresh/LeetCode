class MaxHeap {
    constructor() { this.data = []; }
    push(val) {
        this.data.push(val);
        this._up(this.data.length - 1);
    }
    pop() {
        if (this.data.length === 1) return this.data.pop();
        const top = this.data[0];
        this.data[0] = this.data.pop();
        this._down(0);
        return top;
    }
    _up(i) {
        while (i > 0) {
            let p = Math.floor((i - 1) / 2);
            if (this.data[p][0] >= this.data[i][0]) break;
            [this.data[p], this.data[i]] = [this.data[i], this.data[p]];
            i = p;
        }
    }
    _down(i) {
        let n = this.data.length;
        while (true) {
            let l = 2 * i + 1, r = 2 * i + 2, max = i;
            if (l < n && this.data[l][0] > this.data[max][0]) max = l;
            if (r < n && this.data[r][0] > this.data[max][0]) max = r;
            if (max === i) break;
            [this.data[i], this.data[max]] = [this.data[max], this.data[i]];
            i = max;
        }
    }
    size() { return this.data.length; }
}

var maxAverageRatio = function(classes, extraStudents) {
    const gain = (p, t) => (p + 1) / (t + 1) - p / t;
    let pq = new MaxHeap();
    for (let [p, t] of classes) {
        pq.push([gain(p, t), p, t]);
    }
    while (extraStudents-- > 0) {
        let [g, p, t] = pq.pop();
        p++; t++;
        pq.push([gain(p, t), p, t]);
    }
    let sum = 0;
    while (pq.size() > 0) {
        let [g, p, t] = pq.pop();
        sum += p / t;
    }
    return sum / classes.length;
};