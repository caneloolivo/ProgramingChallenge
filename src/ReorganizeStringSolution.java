import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeStringSolution {
	class MultiChar {
	    int count;
	    char letter;
	    MultiChar(int ct, char ch) {
	        count = ct;
	        letter = ch;
	    }
	}
	public String reorganizeString(String s) {		
		StringBuilder result = new StringBuilder();
		int N = s.length();
        int[] count = new int[26];
        for (char c: s.toCharArray()) count[c-'a']++;
        PriorityQueue<MultiChar> pq = new PriorityQueue<MultiChar>((a, b) ->
            a.count == b.count ? a.letter - b.letter : b.count - a.count);

        for (int i = 0; i < 26; ++i) if (count[i] > 0) {
            if (count[i] > (N + 1) / 2) return "";
            pq.add(new MultiChar(count[i], (char) ('a' + i)));
        }
        while (pq.size() >= 2) {
            MultiChar mc1 = pq.poll();
            MultiChar mc2 = pq.poll();
            result.append(mc1.letter);
            result.append(mc2.letter);
            if (--mc1.count > 0) 
            	pq.add(mc1);
            if (--mc2.count > 0) 
            	pq.add(mc2);
            }

        if (pq.size() > 0) 
        	result.append(pq.poll().letter);			
        return result.toString();
	}
}
