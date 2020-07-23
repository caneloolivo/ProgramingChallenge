import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class SingleNumberSolution {
	public int[] singleNumber(int[] nums) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int num: nums) {
			if(s.contains(num))
				s.remove(num);
			else
				s.add(num);
		}
		int[] result = new int[s.size()];
		Iterator<Integer> i = s.iterator();
		int x=0;
		while(i.hasNext()) {
			result[x] = i.next();
			x++;
		}
		return result;
	}
	
	public int[] singleNumber2(int[] nums) {
		Arrays.sort(nums);
		Stack<Integer> s = new Stack<Integer>();
		for(int num: nums) {
			if(s.isEmpty())
				s.push(num);
			else if(s.peek()== num)
				s.pop();
			else
				s.push(num);			
		}
		int[] result = new int[s.size()];
		Iterator<Integer> i = s.iterator();
		int x=0;
		while(i.hasNext()) {
			result[x] = i.next();
			x++;
		} 
		return result;
	}
	
	public static void main(String[] args) {
		SingleNumberSolution solution = new SingleNumberSolution();
		int[] nums = {1,2,1,3,2,5};
		int[] result = solution.singleNumber2(nums);
		for(int number: result)
			System.out.println(number);
	}
}
