
public class RemoveDuplicateLettersSolution {
	public String removeDuplicateLetters(String s) {
        StringBuilder result = new StringBuilder();
        int [] count = new int[26];
        boolean [] visited = new boolean[26];
        for(char c : s.toCharArray())
        	count[c - 'a']++;
        for(char c : s.toCharArray()) {
        	count[c -'a']--;
        	if(visited[c-'a'])
        		continue;
        	while(result.length() >0 
        			&& c <= result.charAt(result.length()-1) 
        			&& count[result.charAt(result.length()-1) -'a'] > 0) {
        		visited[result.charAt(result.length() -1) -'a'] = false;
        		result.deleteCharAt(result.length()-1);        		
        	}
        	visited[c-'a'] = true;
        	result.append(c);
        }        
        return result.toString();
    }
}
