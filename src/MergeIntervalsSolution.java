import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsSolution {
	public int[][] merge(int[][] intervals) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int x = 0; x< intervals.length; x++) {
			List<Integer> tmpResult = new ArrayList<Integer>();
			int interval = (x== intervals.length-1)?0 :x+1;
			if(intervals[x][intervals[x].length-1] >= intervals[interval][0] &&
					intervals[x][intervals[x].length-1] <= intervals[interval][intervals[interval].length-1]) {				
				tmpResult.add(Math.min(intervals[x][0], intervals[interval][0]));
				tmpResult.add(Math.max(intervals[x][intervals[x].length-1], intervals[interval][intervals[interval].length-1]));
				x++;
			}
			else
			{
				for(int y = 0; y < intervals[x].length; y ++)
					tmpResult.add(intervals[x][y]);
			}
			result.add(tmpResult);
		}
		int[][] resultToresutl = new int[result.size()][];
		for(int x = 0; x< result.size(); x++) {
			resultToresutl[x] = new int[result.get(x).size()];
			for(int y=0; y < result.get(x).size(); y++)
				resultToresutl[x][y]= result.get(x).get(y);
		}
		return resultToresutl;
    }
	
	public int[][] merge2(int[][] intervals){
		if (intervals.length == 0) return intervals;        
		
        Arrays.sort(intervals, (int[] n1, int[] n2) -> n1[0]-n2[0]);        
        int index = 0;        
        for (int i = 1; i < intervals.length; i++) {            
            if (intervals[index][1] >= intervals[i][0]) {                
                if (intervals[index][1] < intervals[i][1])
                	intervals[index][1] = intervals[i][1];
            } else {                
                intervals[++index] = intervals[i];
            }
        }        
        return Arrays.copyOf(intervals, index+1);
	}
	
	public int[][] merge3(int[][] intervals){
		if (intervals.length==0)
			return intervals;
		Arrays.sort(intervals,(int[] n1, int[] n2)-> n1[0]- n2[0]);
		int index=0;
		for(int x = 1; x<intervals.length; x++ ) {
			if(intervals[index][1] >= intervals[x][0]) {
				if(intervals[index][1] < intervals[x][1])
					intervals[index][1] = intervals[x][1];				
			}				
			else
				intervals[++index]=intervals[x];			
		}
		return Arrays.copyOf(intervals, index+1);
	}
	
	public static void main(String[] args) {
		MergeIntervalsSolution solution = new MergeIntervalsSolution();
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] result = solution.merge2(intervals);
		System.out.print("El resultado fue " + String.valueOf(result));
	}
}
