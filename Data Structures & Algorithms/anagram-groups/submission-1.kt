class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<String, MutableList<String>>()
        for (str in strs) {
            val count = IntArray(26)
            for(char in str) {
                count[char - 'a']++
            }
            val key = count.joinToString("#")
            if(result[key] != null) {
                result[key]?.add(str)
            } else {
                result[key] = mutableListOf(str)
            }
        }
        return result.values.toList()
    }
}
