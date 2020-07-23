
public class RemoveNthNodeFromEndListSolution {
	/**
	 * Definition for singly-linked list.
	 */
	 static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {        
		ListNode fast = head;
        ListNode slow = head;
        int i = 0;
 
		while(i < n && fast.next != null) {
            fast = fast.next;
            i++;
        }
        if(i < n) return head.next;
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
	
	public void printNode(ListNode head) {
		if(head != null) {
			System.out.println(head.val);
			printNode(head.next);
		}
	}
	
	public static void main(String[] args) {
		RemoveNthNodeFromEndListSolution solution = new RemoveNthNodeFromEndListSolution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode result = solution.removeNthFromEnd(head, 2);
		solution.printNode(result);
		
	}
}
