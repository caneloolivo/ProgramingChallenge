
public class BreakingRecordsSolution {
	static int[] breakingRecords(int[] scores) {
		int [] times = new int[2];
		int countMax=0;
		int countMin=0;
		int max = scores[0];
		int min = scores[0];
		for(int x = 1; x< scores.length; x++) {
			if(max < scores[x]) {				
				countMax++;
				max=scores[x];
			}
			if(scores[x]< min) {
				countMin++;
				min = scores[x];;
			}
		}
		times[0]=countMax;
		times[1] = countMin;
		return times;
    }
	public static void main(String[] args) {
		int [] scores = {3,4,21,36,10,28,35,5,24,42};
		int[] result = breakingRecords(scores);
		for(int x= 0; x<result.length; x++)
			System.out.println(result[x]);
	}
}
