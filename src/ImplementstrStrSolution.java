public class ImplementstrStrSolution {
	public int strStr(String haystack, String needle) {
		if(haystack.equals(needle))
			return 0;
		for(int i = 0; i < haystack.length() - needle.length() +1; i++) {
			String tmp = haystack.substring(i, i + needle.length());
			if(tmp.equals(needle))
				return i;
		}
		return -1;
    }
	
	public static void main(String [] args) {
		ImplementstrStrSolution solution = new ImplementstrStrSolution();
//		String haystack = "hello", needle = "ll";
		int result = solution.strStr("mississippi",	"pi");
		System.out.println("El index de needle es: " + result);
	}
}
