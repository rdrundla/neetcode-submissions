class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val hashSet = HashSet<Int>()

        for (i in 0 until nums.size) {
            hashSet.add(nums[i])
        }

        var ans = 0
        for (i in 0 until nums.size) {
            if (i == 0 || !hashSet.contains(nums[i]-1)) {
                var size = 1
                var n = nums[i]
                while(hashSet.contains(n)) {
                    if (size > ans) {
                        ans = size
                    }
                    size++
                    n++
                }
            }
        }

        return ans
    }
}
