import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RobotReturnOriginSolution {
	public boolean judgeCircle(String moves) {
		int up = 0;
		int rigth = 0;
		for(char mov: moves.toCharArray()) {
			switch(mov) {
			case 'R':
				rigth++;
				break;
			case 'L':
				rigth--;
				break;
			case 'U':
				up++;
				break;
			default:
				up--;
				break;
			}			
		}
		return up == 0 && rigth ==0;
    }
	
	public static void main(String[] args) {
		RobotReturnOriginSolution solution = new RobotReturnOriginSolution();
		String moves = "RLUURDDDLU";
		System.out.println("Y regreso al origen " +solution.judgeCircle(moves));
	}
}
