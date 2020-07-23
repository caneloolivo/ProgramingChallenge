public class LongestCommonPrefixSolution {
	public String longestCommonPrefix(String[] strs) {        
		if(strs.length==0)
			return "";
		String prefix = strs[0];
		for(int x = 1; x< strs.length; x++ ) {
			while(strs[x].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
    }
	public String longestCommonPrefix2(String[] strs) {  
		return "";
    }
	
	public static void main(String[] args) {
		LongestCommonPrefixSolution 
		solution = new LongestCommonPrefixSolution();
		String[] strs = {"flower","flow","flight"};
		System.out.println("Este es el prefijo "+ 
		solution.longestCommonPrefix2(strs));
	}
}
