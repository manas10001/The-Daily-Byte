/*
Given a linked list and a value n, remove the nth to last node and return the resulting list.

Ex: Given the following linked lists...

1->2->3->null, n = 1, return 1->2->null
1->2->3->null, n = 2, return 1->3->null
1->2->3->null, n = 3, return 2->3->null

Problem available on leetcode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/

class RemoveNthFromLast{
	public ListNode removeNthFromEnd(ListNode head, int n) {
        //take a temp node n-1 ahead from head
        ListNode temp = head;
        
        for(int i = 0; i < n; i++)
                temp = temp.next;
        
        //corner case single element in ll
        if(temp == null)
            return head.next;
        
        //start a new node from head and take it ahed until the next of temp is null
        ListNode ans = head;
        while(temp.next != null){
            temp = temp.next;
            ans = ans.next;
        }
        //ans is the node prev to node to be removed
        ans.next = ans.next.next;
        return head;
    }
}
