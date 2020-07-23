public class LengthOfLastWordSolution {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		if(s.isEmpty())
			return 0;
		String[] words = s.split(" ");
		return words[words.length-1].length();
    }
	
	public static void main(String[] args) {
		LengthOfLastWordSolution solution = new LengthOfLastWordSolution();
		int result = solution.lengthOfLastWord("Hello World");
		System.out.println("El tamaño es " + result);
	}
}
