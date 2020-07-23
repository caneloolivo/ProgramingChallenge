import java.util.Stack;

public class AddTwoNumbersSolution {
	private static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	    	if(p!= null) {
	    		carry += p.val;
	    		p = p.next;
	    	}
	    	if(q != null) {
	    		carry += q.val;
	    		q = q.next;
	    	}	        
	        curr.next = new ListNode(carry % 10);
	        carry =  carry / 10;
	        curr = curr.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
    }
	
	
	public static void main(String[] args) {
		AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
		ListNode one = new ListNode(2);
		one.next = new ListNode(4);
		one.next.next = new ListNode(3);
		ListNode two = new ListNode(5);
		two.next = new ListNode(6);
		two.next.next = new ListNode(4);
		ListNode result = solution.addTwoNumbers(one, two);
	}
}
