class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false
        val stack  = ArrayDeque<Char>()
        for (c in s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c)
            } else {
                if (stack.isEmpty()) return false
                val lastPar = stack.removeLast()
                if (c == ')' && lastPar != '(') {
                    return false
                } else if  (c == '}' && lastPar != '{') {
                    return false
                } else if (c == ']' && lastPar != '[') {
                    return false
                }
            }
        }
        
        return stack.isEmpty()
    }
}
