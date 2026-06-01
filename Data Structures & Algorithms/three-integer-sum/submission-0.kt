class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val set = hashSetOf<List<Int>>()

        for (i in 0 until nums.size) {
            var s = i+1
            var e = nums.size-1
            while(s < e) {
                val sum = nums[s] + nums[e] + nums[i]
                if (sum < 0) {
                    s++
                } else if (sum > 0) {
                    e--
                } else {
                    set.add(listOf(nums[i], nums[s], nums[e]).sorted())
                    s++
                }
            }
        }

        return set.toList()

    }
}
