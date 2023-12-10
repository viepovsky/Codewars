const findAverage = function (nums) {
    return Array.from(nums).map(Number).reduce((a,b) => a + b) / nums.length;
    //nums.reduce((a,b) => a + b) / nums.length; <- better
}