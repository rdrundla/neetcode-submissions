class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val hashMapS = HashMap<Char, Int>()
        val hashMapT = HashMap<Char, Int>()

        if (s.length != t.length) return false

        for (char in s) {
            hashMapS.put(char, (hashMapS[char]?:0) + 1)
        }

        for (char in t) {
            hashMapT.put(char, (hashMapT[char]?:0) + 1)
        }

        if(hashMapS == hashMapT) return true else return false
    }
}
