/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var n = nums.length;
    var ans = 0;
    for(let i=0;i<n;i++){
        init = fn(init,nums[i]);
    }
    return init;
};