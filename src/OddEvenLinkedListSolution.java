public class OddEvenLinkedListSolution {
	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode oddEvenList(ListNode head) {
		ListNode root = head;
		ListNode even = head.next;
		ListNode evenHead = head.next;
		
		while(evenHead != null && evenHead.next != null) {
			root.next = root.next.next;
			root = root.next;
			evenHead.next = evenHead.next.next;
			evenHead = evenHead.next;
		}
		
		root.next = even;
		return head;
    }
	
	public void printList(ListNode head) {
		if(head != null) {
			System.out.println(head.val + " ,");
			printList(head.next);
		}
	}
	
	public static void main(String[] args) {
		OddEvenLinkedListSolution solution = new OddEvenLinkedListSolution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode result = solution.oddEvenList(head);
		solution.printList(result);
	}
}
