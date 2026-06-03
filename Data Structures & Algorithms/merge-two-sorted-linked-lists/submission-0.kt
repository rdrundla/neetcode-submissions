/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var t1: ListNode? = list1
        var t2: ListNode? = list2
        val ans: ListNode = ListNode(0)

        var cur: ListNode? = ans

        while(t1 != null && t2 != null) {
            if (t1.`val` <= t2.`val`) {
                cur?.next = t1
                t1 = t1?.next
            } else  {
                cur?.next = t2
                t2 = t2?.next
            }
            cur = cur?.next
        }

        while(t1 != null) {
            cur?.next = t1
            t1 = t1?.next
            cur = cur?.next
        }

        while(t2 != null) {
            cur?.next = t2
            t2 = t2?.next
            cur = cur?.next
        }

        return ans.next

    }
}
