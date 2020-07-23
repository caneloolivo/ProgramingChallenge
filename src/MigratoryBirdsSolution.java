import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirdsSolution {
	static int migratoryBirds(List<Integer> arr) {
		int [] birds = new int[5];
		for(int x=0; x<arr.size(); x++) {
			switchBirds(birds, arr.get(x));
		}
		int bird = 1;
		int maxCount=0;
		for(int x=0; x<birds.length; x++) {
			if(birds[x]> maxCount) {
				maxCount = birds[x];
				bird = x+1;
			}
		}
		return bird;
    }
	
	
	static void switchBirds(int birds [], int bird) {
		switch(bird) {
		case 1:
			birds[0] = birds[0] +1;
			break;
		case 2:
			birds[1] = birds[1] +1;
			break;
		case 3:
			birds[2] = birds[2] +1;
			break;
		case 4:
			birds[3] = birds[3] +1;
			break;
		case 5:
			birds[4] = birds[4] +1;
			break;
		}
	}
	
	public static void main(String [] args) {
		List<Integer> arr = new ArrayList<Integer>();		
		//1 2 3 4 5 4 3 2 1 3 4
		arr.add(1);		
		arr.add(2);
		arr.add(3);
		arr.add(4);		
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		int result = migratoryBirds(arr);
		System.out.println(result);
	}
}
