import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesSolution {	
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		Stack<Character> parentheses = new Stack<Character>();
		
		for(char p: s.toCharArray()) {
			if(map.containsKey(p))
				parentheses.push(map.get(p));
			else {
				if(parentheses.empty() || parentheses.peek() != p)
					return false;
				else if(parentheses.peek() == p)
					parentheses.pop();				
			}						
		}
		return true;
    }
	
	public boolean isValid2(String s) {
		Stack<Character> parentheses = new Stack<Character>();		
		for(char p: s.toCharArray()) {
			if(p == '(' ) 
				parentheses.push(')');
			else if( p == '[')
				parentheses.push(']');
			else if(p == '{')
				parentheses.push('}');
			else {
				if(parentheses.empty() || parentheses.peek() != p)
					return false;
				else if(parentheses.peek() == p)
					parentheses.pop();				
			}						
		}
		return parentheses.size() == 0;
	}
	
	public static void main(String[] args) {
		ValidParenthesesSolution solution = new ValidParenthesesSolution();
		System.out.println("Es un parenesis valido "+ 
		solution.isValid2("()"));
	}
}
