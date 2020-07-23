import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolateSolution {
	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		for(int x = 0;x <s.size(); x++ ) {
			int sum = 0;
			for(int y = 0; y<m && y+x< s.size(); y++) {
				sum+= s.get(x+y);
			}
			if(sum==d)
				count++;
		}
		return count;
    }
	public static void main(String []args) {
		List<Integer> slides = new ArrayList<Integer>();
		//5 2 2 1 5 3 2
		slides.add(5);
		slides.add(2);
		slides.add(2);
		slides.add(1);
		slides.add(5);
		slides.add(3);
		slides.add(2);
		//slides.add(4);
		int result = birthday(slides, 9, 3);
		System.out.print(result);
	}
}
