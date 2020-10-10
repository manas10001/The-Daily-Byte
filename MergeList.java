/*
Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

Ex: Given the following lists...

list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null

Problem available on leetcode: https://leetcode.com/problems/merge-two-sorted-lists/
*/


class MergeList{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //approaching with merge sort 
        
        if(l1 == null && l2 == null)
            return null;
        
        ListNode head = new ListNode();
        ListNode n1 = l1, n2 = l2, l = head;
        
        while(n1 != null && n2 != null){
            if(n1.val < n2.val){
                l.next = new ListNode(n1.val);
                n1 = n1.next;
                l = l.next;
            }else{
                l.next = new ListNode(n2.val);
                n2 = n2.next;
                l = l.next;
            }
        }
        
        //add remaining of n1 if any
        while(n1 != null){
            l.next = new ListNode(n1.val);
            n1 = n1.next;
            l = l.next;
        }
        
        //add remaining of n2 if any
        while(n2 != null){
            l.next = new ListNode(n2.val);
            n2 = n2.next;
            l = l.next;
        }
        return head.next;
    }
}
