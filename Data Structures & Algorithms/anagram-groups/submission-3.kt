class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = HashMap<String, MutableList<String>>()
        var h = 0;
        for (i in strs.indices) {
            val freq = IntArray(26)
            val s = strs[i]
            for (c in s) {
                freq[c - 'a']++
            }
            val h = freq.joinToString(",")
            map.getOrPut(h) { mutableListOf() }.add(s)
        }

        return map.values.toList()

    }
}
