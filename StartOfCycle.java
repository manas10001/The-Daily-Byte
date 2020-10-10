/*
Given a potentially cyclical linked list where each value is unique, return the node at which the cycle starts. If the list does not contain a cycle, return null.

Ex: Given the following linked lists...

1->2->3, return null
1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2
1->9->3->7->7 (7 points to itself), return a reference to the node containing 7

Problem available on leetcode: https://leetcode.com/problems/linked-list-cycle-ii
*/

class StartOfCycle{
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                //we hav cycle
                if(slow == head)
                    return head;
                else{
                    fast = head;
                    while(slow.next != fast.next){
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return slow.next;
                }
            }
        }
        return null;
    }
}
