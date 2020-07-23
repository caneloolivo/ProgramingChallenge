
public class RemoveOutermostParenthesesSolution {
	public String removeOuterParentheses(String S) {
		StringBuilder result = new StringBuilder();
		int p = 0;		
		for(int i = 0; i < S.length(); i ++) {
			if(S.charAt(i) == '(') {
				if(p != 0)
					result.append(S.charAt(i));
				p++;
			}
			else {
				p--;
				if(p != 0)
					result.append(S.charAt(i));
			}
		}
        return result.toString();
    }
}
