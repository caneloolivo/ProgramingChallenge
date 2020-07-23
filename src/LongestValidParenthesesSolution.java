import java.time.Period;
import java.util.Stack;

public class LongestValidParenthesesSolution {
	public int longestValidParentheses(String s) {
//		Stack<Character> partentheses = new Stack<Character>();
//		int count = 0;
//		for(char c: s.toCharArray()) {
//			if(c == '(')
//				partentheses.add(c);
//			else if(!partentheses.isEmpty()) {
//				partentheses.pop();
//				count+=2;
//			}				
//		}
//		return count;
		
		int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
	}
	
	public static void main(String[] args) {
		LongestValidParenthesesSolution solution = new LongestValidParenthesesSolution();
		int result = solution.longestValidParentheses("(()");
		System.out.print("Puto "+ result);
	}
}
