class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map  = HashMap<Int, Int>()
        
        for(i in nums.indices) {
            val complement = target - nums[i]
            if(map.containsKey(complement)) {
                val j = map[complement]!!
                return intArrayOf(minOf(i, j), maxOf(i, j))
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
