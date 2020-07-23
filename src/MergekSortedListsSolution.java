import java.util.PriorityQueue;

public class MergekSortedListsSolution {
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int val) { this.val = val; }
	}
	public ListNode mergeKLists(ListNode[] lists) {		
		ListNode result = lists[0];
		for(int i = 1; i< lists.length; i++) {
			megerList(result, lists[i]);
//			printList(result, i);
		}
		return result.next;
    }
	
	private ListNode megerList(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val <= l2.val) {
			l1.next = megerList(l1.next, l2);
			return l1;
		}else {
			l2.next = megerList(l1, l2.next);
			return l2;
		}
	}
	
	public ListNode mergeKLists2(ListNode[] lists) {		
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>();		
		for(ListNode root : lists) {
			while(root != null) {
				pr.add(root.val);
				root = root.next;
			}
		}
		if(pr.isEmpty())
			return null;
		ListNode result = new ListNode(pr.poll());
		ListNode tmp = result;
		while(!pr.isEmpty()) {
			int val = pr.poll();
			tmp.next = new ListNode(val);
			tmp = tmp.next;
		}
		return result;
    }
	
	public void printList(ListNode l1) {
		if(l1 != null) {
			System.out.println("EL valor es "+ l1.val);
			printList(l1.next);
		}
	}
	
	public static void main(String[] args) {
		MergekSortedListsSolution solution = new MergekSortedListsSolution();
		ListNode l1 = new ListNode(1);		
		l1.next= new ListNode(4);
		l1.next.next = new ListNode(5);
		ListNode l2 = new ListNode(1);
		l2.next= new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		ListNode[] lists = {l1, l2, l3};
		ListNode result = solution.mergeKLists2(lists);
		solution.printList(result);
	}
}
