
public class NumberOfStepsSolution {
	public int numberOfSteps (int num) {
		int steps = 0;
		while(num > 0) {
			if(num%2 == 0)
				num = num/2;
			else 
				num --;
			steps++;
		}
	    return steps;
	}
	public static void main(String [] args) {
		NumberOfStepsSolution solution = new NumberOfStepsSolution();
		int steps = solution.numberOfSteps(123);
		System.out.println("Hola " + steps);
	}
}
