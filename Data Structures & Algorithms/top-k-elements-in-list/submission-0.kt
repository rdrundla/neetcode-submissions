class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = HashMap<Int, Int>()

        for (num in nums) {
            freq[num] = (freq[num] ?: 0) + 1
        }

        val heap = PriorityQueue<Int> { a, b ->
            freq[a]!! - freq[b]!!
        }

        for (num in freq.keys) {
            heap.add(num)

            if(heap.size > k) {
                heap.poll()
            }
        }
        return heap.toIntArray()
    }
}
