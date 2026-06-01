class Solution {
    fun maxArea(heights: IntArray): Int {
        if (heights.size < 2) return 0
        var s = 0
        var e = heights.size - 1
        var max = 0
        var area = 0
        while (s < e) {
            area = area(s, e, heights)
            if (area > max) {
                max = area
            }
            if (heights[s] < heights[e]) {
                s++
            } else {
                e--
            }
        }
        return max
    }

    fun area(i: Int, j: Int, arr: IntArray): Int {
        return (j - i) * minOf(arr[i], arr[j])
    }
}
