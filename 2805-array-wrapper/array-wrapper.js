/**
 * @param {number[]} nums
 */
var ArrayWrapper = function(nums) {
    this.array = nums
};

ArrayWrapper.prototype.valueOf = function() {
    return this.array.reduce((pre, cur)=>pre+cur,0)
}

ArrayWrapper.prototype.toString = function() {
    return JSON.stringify(this.array)
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */