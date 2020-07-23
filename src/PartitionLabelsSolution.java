import java.util.ArrayList;
import java.util.List;

public class PartitionLabelsSolution {
	public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<Integer>();
        int n = S.length();
        int[] lastPosition = new int[26];
        for(int i = 0; i < n; i ++)
        	lastPosition [S.charAt(i) - 'a'] = i;
        int j = 0, anchor = 0;
        for(int i = 0; i < n; i++) {
        	j = Math.max(j , lastPosition[S.charAt(i) -'a']);
        	if(i == j) {
        		result.add(i - anchor +1);
        		anchor = i +1;
        	}
        }
        return result;
    }
}
