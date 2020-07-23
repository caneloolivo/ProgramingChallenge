
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MakeTwoStringsAnagramsSolution {
	public int minSteps(String s, String t) {
		Stack<Character> anagram = new Stack<Character>();
		for(char c: s.toCharArray()) {
			anagram.add(c);
		}
		for(char c: t.toCharArray()) {
			if(anagram.contains(c)) 
				anagram.removeElement(c);
		}
		return anagram.size();
    }
	
	public static void main(String[] args) {
		MakeTwoStringsAnagramsSolution solution 
		= new MakeTwoStringsAnagramsSolution();
		int result = solution.minSteps("friend", "family");
		System.out.println("Te salio " + result);
	}
}
