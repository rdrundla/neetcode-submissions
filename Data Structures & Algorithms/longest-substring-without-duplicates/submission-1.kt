class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length == 0 || s.length == 1) return s.length

        val hashSet = HashSet<Char>()

        var l = 0
        val len = s.length
        hashSet.add(s[l])
        var ans = 1;

        for(r in 1 until len) {
            while (hashSet.contains(s[r])) {
                hashSet.remove(s[l])
                l++
            }
            hashSet.add(s[r])
            if (r-l + 1 > ans) {
                ans = r-l+1
            }

        }
        return ans

    }
}
