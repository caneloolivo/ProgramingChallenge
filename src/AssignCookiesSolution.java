import java.util.Arrays;

public class AssignCookiesSolution {
	public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.parallelSort(g);
        Arrays.parallelSort(s);
        int position = s.length-1;
        for(int i = g.length-1; i >= 0; i--) {
        	if(s[position] >= g[i]) {
        		count ++;
        		position --;
        	}        	
        	
        	if(position ==-1)
        		break;
        }
        return count;
    }
}
