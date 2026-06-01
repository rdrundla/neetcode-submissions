class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }

        val buckets = Array(nums.size + 1) {mutableListOf<Int>()}

        for ((num, freq) in map) {
            buckets[freq].add(num)
        }
        val result = mutableListOf<Int>()
        for ( i in buckets.indices.reversed()) {
            for( num in buckets[i]) {
                result.add(num) 
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}
