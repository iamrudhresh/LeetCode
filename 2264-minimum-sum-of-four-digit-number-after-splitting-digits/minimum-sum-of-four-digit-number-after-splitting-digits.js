/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function (num) {

    const arr = num.toString().split('').sort()
    return parseInt(arr[0] + arr[2]) + parseInt(arr[1] + arr[3])


};