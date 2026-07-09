/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast?.next != null && fast?.next?.next != null) {
            fast  = fast?.next?.next
            slow = slow?.next
        }


        var prev: ListNode? = null
        var cur: ListNode? = slow?.next
        slow?.next = null

        while(cur != null) {
            var tempNext: ListNode? = cur?.next
            cur?.next = prev
            prev = cur
            cur = tempNext
        }

        var first: ListNode? = head
        var second: ListNode? = prev

        while (second != null) {
            val t1: ListNode? = first?.next
            val t2: ListNode? = second?.next

            first?.next = second
            second?.next = t1

            first = t1
            second = t2
        }
    }
}
