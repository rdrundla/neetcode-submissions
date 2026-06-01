class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val prefix = IntArray(nums.size)
        val res = IntArray(nums.size)

        prefix[0] = 1
        for (i in 1 until nums.size) {
            prefix[i] = prefix[i-1] * nums[i-1]
        }

        var suffix = 1

        for (i in nums.size-1 downTo 0) {
            res[i] = suffix * prefix[i]
            suffix = suffix * nums[i]
        }

        return res

    }
}
