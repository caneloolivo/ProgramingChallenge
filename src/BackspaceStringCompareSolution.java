import java.util.Stack;

public class BackspaceStringCompareSolution {
	public boolean backspaceCompare(String S, String T) {
		StringBuilder s = new StringBuilder();
		StringBuilder t = new StringBuilder();
		for(int i = 0; i < S.length(); i ++) {
			if(S.charAt(i) == '#' && s.length() != 0)
				s.deleteCharAt(s.length()-1);
			else if (Character.isLetter(S.charAt(i)))
				s.append(S.charAt(i));
		}
		for(int i = 0; i < T.length(); i ++) {
			if(T.charAt(i) == '#' && t.length() != 0)
				t.deleteCharAt(t.length()-1);
			else if (Character.isLetter(T.charAt(i)))
				t.append(T.charAt(i));
		}
		return s.toString().equals(t.toString());
    }
	
	public boolean backspaceCompare2(String S, String T) {
		Stack<Character> s = new Stack<Character>();
		Stack<Character> t = new Stack<Character>();
		for(char c : S.toCharArray()) {
			if(c !='#')
				s.push(c);
			else if(!s.isEmpty())
				s.pop();
		}
		for(char c : T.toCharArray()) {
			if(c !='#')
				t.push(c);
			else if(!t.isEmpty())
				t.pop();
		}
		
		while(!s.isEmpty() && !t.isEmpty()) {
			if(s.peek() != t.peek())
				return false;
			s.pop();
			t.pop();
		}
		return s.isEmpty() && t.isEmpty();
		
    } 
	public static void main(String[] args) {
		BackspaceStringCompareSolution solution = new BackspaceStringCompareSolution();
		String S = "a##c";
		String T = "#a#c";		
		boolean result = solution.backspaceCompare2(S, T);
		System.out.println("Son iguales " + result);
		
	}
}
