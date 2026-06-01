class Solution {
    fun isPalindrome(s: String): Boolean {

        if (s.length == 0 || s.length == 1) return true
        var start = 0
        var end = s.length-1
        val ss = s.lowercase()

        while(start <= end) {
            while(start < end && !ss[start].isLetterOrDigit()) start++
            while(start < end && !ss[end].isLetterOrDigit()) end--

            if (ss[start] != ss[end]) return false
            start++
            end--
        }

        return true

    }
}
