import java.util.HashMap;

public class RansomNoteSolution {
	public boolean canConstruct(String ransomNote, String magazine) {
		char[] alphabet = new char[26];
		for(char m: magazine.toCharArray()){
			alphabet[m -'a']++;
		}
		for(char r: ransomNote.toCharArray()) {
			if(alphabet[r -'a'] == 0)
				return false;
			alphabet[r - 'a']--;
		}
		return true;
    }
	
	public static void main(String[] args) {
		RansomNoteSolution solution = new RansomNoteSolution();
		String ransomNote = "aa", magazine = "aab";
		boolean result = solution.canConstruct(ransomNote, magazine);
		System.out.print("La respuesta es " + result);
	}
}
