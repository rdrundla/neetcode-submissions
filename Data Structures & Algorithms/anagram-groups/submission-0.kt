class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<HashMap<Char, Int>, MutableList<String>>()
        for (str in strs) {
            val map = HashMap<Char, Int>()
            for(char in str) {
                map.put(char, (map[char]?:0) +1)
            }
            if(result[map] != null) {
                result[map]?.add(str)
            } else {
                result[map] = mutableListOf(str)
            }
        }
        return result.values.toList()
    }
}
