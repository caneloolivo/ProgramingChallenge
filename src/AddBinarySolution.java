
public class AddBinarySolution {
	public String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;
        while(m>=0 || n>=0) {
        	int n1 = (m>=0)? a.charAt(m--)-'0': 0;
        	int n2 = (n>=0)? b.charAt(n--)-'0': 0;
        	result.append(((n1+n2) + carry )% 2);
        	carry = ((n1+n2) + carry )/2;
        }
        if(carry != 0)
        	result.append(carry);
        return String.valueOf(result.reverse());
    }
	
	public String addBinary2(String a, String b) {
        StringBuffer result = new StringBuffer();
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;        
        while(m>=0 || n>=0) {
        	if(m >= 0) 
        		carry += a.charAt(m--) -'0';
        	if(n >=0)
        		carry += b.charAt(n--)-'0';
        	result.append(carry % 2);
        	carry = (carry)/2;
        }
        if(carry != 0)
        	result.append(carry);
        return String.valueOf(result.reverse());
    }
	
	public static void main(String[] args) {
		AddBinarySolution solution = new AddBinarySolution();
		String result = solution.addBinary2("1010","1011");
		System.out.println("La suma binaria da " + result + " " +
		solution.addBinary("1010","1011"));
	}
}
