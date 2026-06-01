class Solution {
    fun isPalindrome(s: String): Boolean {

        if (s.length == 0 || s.length == 1) return true
        var start = 0
        var end = s.length-1

        while(start <= end) {
            while(start < end && !s[start].isLetterOrDigit()) start++
            while(start < end && !s[end].isLetterOrDigit()) end--

            if (s[start].lowercase() != s[end].lowercase()) return false
            start++
            end--
        }

        return true

    }
}
