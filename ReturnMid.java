/*
Given a non-empty linked list, return the middle node of the list. If the linked list contains an even number of elements, return the node closer to the end.

1->2->3->null, return 2
1->2->3->4->null, return 3
1->null, return 1

Problem available on leetcode: https://leetcode.com/problems/middle-of-the-linked-list
*/

class ReturnMid{
	public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
