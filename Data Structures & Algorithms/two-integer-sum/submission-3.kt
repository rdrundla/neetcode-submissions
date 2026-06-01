class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var remaing = 0

        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            remaing = target - nums[i]

            if (map.containsKey(remaing)) {
                return intArrayOf(map[remaing]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf(-1, -1)

    }

}
