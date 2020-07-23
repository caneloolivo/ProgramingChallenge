
public class MergeTwoSortedListsSolution {
	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
	    if(l2 == null) return l1;

	    if(l1.val<=l2.val){
	        l1.next = mergeTwoLists(l1.next, l2);
	        return l1;
	    } else {
	        l2.next = mergeTwoLists(l1, l2.next);
	        return l2;
	    }
    }
	
	public void printList(ListNode l1) {
		if(l1 != null) {
			System.out.println("EL valor es "+ l1.val);
			printList(l1.next);
		}
	}
	
	public static void main(String[] args) {		
		MergeTwoSortedListsSolution solution = new MergeTwoSortedListsSolution();
		ListNode l1 = new ListNode(1);		
		l1.next= new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next= new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode result = solution.mergeTwoLists(l1, l2);
		solution.printList(result);
	}
}
