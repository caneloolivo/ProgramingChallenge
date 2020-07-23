
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class ConvertBinaryNumberLinkedListIntegerSolution {	
	public int getDecimalValue(ListNode head) {
		int result = 0;
		int base = 1;
		while(head != null) {
			result += head.val * base;
			base = base*2;
			head = head.next;
		}        
        return result;
    }
	
//	public int getValue(ListNode node) {
//		
//	}
	
	public static void main(String[] args) {
		ConvertBinaryNumberLinkedListIntegerSolution solution = new ConvertBinaryNumberLinkedListIntegerSolution();
		ListNode head = new ListNode(1);
		head.next= new ListNode(0);
		head.next.next = new ListNode(1);
		int result = solution.getDecimalValue(head);
		System.out.println("el numero es " + result);
	}
}
