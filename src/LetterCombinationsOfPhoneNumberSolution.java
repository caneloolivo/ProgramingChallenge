import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumberSolution {
	private static HashMap<Character, char[]> map = new HashMap<Character, char[]>();
	static {
		map.put('2', new char[] {'a', 'b', 'c'});
		map.put('3', new char[] {'d', 'e', 'f'});
		map.put('4', new char[] {'g', 'h', 'i'});
		map.put('5', new char[] {'j', 'k', 'l'});
		map.put('6', new char[] {'m', 'n', 'o'});
		map.put('7', new char[] {'p', 'q', 'r', 's'});
		map.put('8', new char[] {'t', 'u', 'v'});
		map.put('9', new char[] {'w', 'x', 'y', 'z'});
	}
	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.equals(""))
        	return result;
        List<char[]> charArrays = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char digit : digits.toCharArray())
        	charArrays.add(map.get(digit));
        
        int [] indexArray = new int[charArrays.size()];
        int loop = 1;        
        for(char[] array : charArrays)
        	loop *= array.length;
                
        int n = indexArray.length;
        for(int i = 0; i < loop; i++) {
        	for(int j = 0; j< n; j++) {
        		sb.append(charArrays.get(j)[indexArray[j]]);
        	}
        	indexArray[n -1 ]++;
        	for(int k = n-1; k > 0; k--){
        		if(indexArray[k] > charArrays.get(k).length -1) {
        			indexArray[k-1]++;
        			indexArray[k] = 0;
        		}
        	}
        	result.add(sb.toString());
        	sb.setLength(0);
        }
                
        return result;
    }
}
