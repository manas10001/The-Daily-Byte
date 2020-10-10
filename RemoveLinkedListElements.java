/*
Given a linked list and a value, remove all nodes containing the provided value, and return the resulting list.

Ex: Given the following linked lists and values...

1->2->3->null, value = 3, return 1->2->null
8->1->1->4->12->null, value = 1, return 8->4->12->null
7->12->2->9->null, value = 7, return 12->2->9->null

Problem available on leetcode: https://leetcode.com/problems/remove-linked-list-elements/
*/

class RemoveLinkedListElements{
	public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        //remove all leading nodes with val val
        while(head != null && head.val == val)
            head = head.next;
            
        ListNode temp = head;
        
        while(temp != null){
            while(temp.next != null && temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
