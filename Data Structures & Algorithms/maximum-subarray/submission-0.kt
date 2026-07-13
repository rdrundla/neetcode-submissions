class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var curSum = 0
        var maxSum = nums[0] 

        for (i in 0 until nums.size) {
            if (curSum < 0) curSum = 0
            curSum += nums[i]
            maxSum = maxOf(curSum, maxSum)
        }

        return maxSum
    }
}
