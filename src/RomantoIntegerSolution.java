import java.util.HashMap;

public class RomantoIntegerSolution {
	
	public int romanToInt(String s) {
		HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();			
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		int result = 0;
		char lastValue = s.charAt(0);
		for(char c: s.toCharArray()) {
			if((c == 'V' || c == 'X') && lastValue == 'I')
					result += romanValues.get(c) - (romanValues.get(lastValue) * 2);					
			else if((c == 'L' || c == 'C') && lastValue == 'X') 
				result += romanValues.get(c) - (romanValues.get(lastValue) * 2);
			else if((c == 'D' || c == 'M') && lastValue == 'C')
					result += romanValues.get(c) - (romanValues.get(lastValue)* 2);
			else 
				result += romanValues.get(c);
			lastValue = c;
		}
		return result;
    }
	public int romanToInt2(String s) {
		HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();			
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		int result = 0;
		for(int i = 0; i< s.length()-1; i ++) {
			if(romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1)))
				result -=  romanValues.get(s.charAt(i));
			else
				result += romanValues.get(s.charAt(i));
		}
		return result += romanValues.get(s.charAt(s.length()-1));
    }
}
