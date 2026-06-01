class Solution {

    fun encode(strs: List<String>): String {
        val en = StringBuilder()
        for (str in strs) {
            en.append(str.length)
            .append('#')
            .append(str)
        }
        return en.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while(str.get(j) != '#') {
                j++
            }

            val length = str.substring(i, j).toInt()

            val s = str.substring(j + 1, j + 1 + length)
            i = j + 1 + length
            result.add(s.toString())
        }
        return result
    }
}
