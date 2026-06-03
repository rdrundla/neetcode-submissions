/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        if (head?.next == null) return head

        var cur: ListNode? = head
        var prev: ListNode? = null

        while (cur != null) {
            val next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        return prev

    }
}
