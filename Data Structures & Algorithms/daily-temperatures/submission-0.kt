class Solution {
    fun dailyTemperatures(temp: IntArray): IntArray {

        val stack = ArrayDeque<Int>()
        val res = IntArray(temp.size)

        stack.addLast(0)

        for (i in 1 until temp.size) {
            while (stack.isEmpty().not() && temp[stack.last()] < temp[i]) {
                val last = stack.removeLast()
                res[last] = i - last
            }
            stack.addLast(i)
        }

        while (stack.isEmpty().not()) {
            val last = stack.removeLast()
            res[last] = 0
        }

        return res

    }
}
