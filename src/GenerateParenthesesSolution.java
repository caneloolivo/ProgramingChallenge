import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesSolution {
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if(n == 0)
        	result.add("");
        else {
        	for(int x = 0; x < n; x++) {
        		for(String l: generateParenthesis(x)) {
        			for(String r: generateParenthesis(n-x-1))
        				result.add("("+l+")"+ r);
        		}
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		GenerateParenthesesSolution solution = new GenerateParenthesesSolution();
		List<String> result = solution.generateParenthesis(3);
		System.out.println(String.valueOf(result));
	}
}
