import java.util.PriorityQueue;

public class MergeSortedArraySolution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < m; i ++)
			pq.offer(nums1[i]);
		for(int num : nums2)
			pq.offer(num);
		int count = 0;
		while(!pq.isEmpty()) {		
			nums1[count++] = pq.poll();
		}		
    }
}
