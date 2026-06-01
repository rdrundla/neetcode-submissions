class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        if (s.length == 1) return 1
        var l = 0
        val freq = IntArray(26)
        var maxFreq = 0
        var ans = 0
        var cIdx = 0
        for (r in s.indices) {
            cIdx = s[r] - 'A'
            freq[cIdx]++

            maxFreq = maxOf(maxFreq, freq[cIdx])

            if ((r - l + 1) - maxFreq > k) {
                freq[s[l]  - 'A']--
                l++
            }

            ans = maxOf(ans, (r - l + 1))
        }

        return ans

    }
}
