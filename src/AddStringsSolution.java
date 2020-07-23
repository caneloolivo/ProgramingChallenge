
public class AddStringsSolution {
	public String addStrings(String num1, String num2) {
		int n = num1.length()-1;
		int m = num2.length()-1;
		int carry = 0;
		String result = "";
		while(n>=0 || m>=0) {
			int n1 = (n>=0)? num1.charAt(n--)-'0' : 0;
			int n2 = (m>=0)? num2.charAt(m--)-'0' : 0;
			result = ((n1 + n2) + carry) % 10 + result;
			carry = ((n1 + n2) + carry ) / 10;			 
		}
		if(carry != 0) {
			result = 1 + result;
 		}
		
		return result;
    }
	
	public static void main(String[] args) {
		AddStringsSolution solution = new AddStringsSolution();
		String result = solution.addStrings("1", "120");
		System.out.println("El resultado de la suma es " + result);
	}
}
