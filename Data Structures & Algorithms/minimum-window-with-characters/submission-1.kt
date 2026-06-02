class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.isEmpty() || t.isEmpty() || s.length < t.length) return ""
        val targetCount = IntArray(128)

        for (c in t) {
            targetCount[c.code]++
        }

        var required = 0

        for (i in 0 until targetCount.size) {
            if (targetCount[i] > 0) required++
        }

        var formed = 0
        var minLen = Int.MAX_VALUE
        val windowCount = IntArray(128)
        var left = 0
        var startIndex = 0

        for (right in 0 until s.length) {
            val ch = s[right].code
            windowCount[ch]++
            if (targetCount[ch] > 0 && targetCount[ch] == windowCount[ch]) {
                formed++
            }

            while(left <= right && required == formed) {
                val curLen = right - left + 1

                if (curLen < minLen) {
                    minLen = curLen
                    startIndex = left
                }
                val lCh = s[left].code
                windowCount[lCh]--
                if (targetCount[lCh] > 0 &&  windowCount[lCh] < targetCount[lCh]) {
                    formed--
                }
                left++
            }
        }

        return if(minLen == Int.MAX_VALUE) return "" else s.substring(startIndex, startIndex + minLen)

    }
}
