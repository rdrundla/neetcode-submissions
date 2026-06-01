class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val hashMapS = HashMap<Char, Int>()
        val hashMapT = HashMap<Char, Int>()

        if (s.length != t.length) return false

        for (i in s.indices) {
            hashMapS.put(s[i], (hashMapS[s[i]]?:0) + 1)
            hashMapT.put(t[i], (hashMapT[t[i]]?:0) + 1)
        }

        if(hashMapS == hashMapT) return true else return false
    }
}
