
public class ReverseWordsStringSolution {
	public String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String[] words = s.trim().split(" ");
		int n = words.length -1;
		for(int i = n; i > -1; i-- ) {
			if(!words[i].isEmpty())
				result.append(words[i].trim() + " ");
		}
		return result.toString().trim();
    }
	
	public String reverseWords2(String s) {
		StringBuilder result = new StringBuilder();
		s = s.trim();
		int n = s.length()-1;
		String subString= "";
		for(int i = 0; i > -1; i--) {
			
		}
		return result.toString().trim();
    }
	
	public static void main(String[] args) {
		ReverseWordsStringSolution solution = new ReverseWordsStringSolution();
		String s= "a good   example";
		String result = solution.reverseWords2(s);
		System.out.println("El resultado fue " + result);
	}
}
