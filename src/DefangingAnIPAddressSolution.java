public class DefangingAnIPAddressSolution {
	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
    }
	
	public static void main(String[] args) {
		DefangingAnIPAddressSolution 
		solution = new DefangingAnIPAddressSolution();
		String result = solution.defangIPaddr("1.1.1.1");
		System.out.println("El resultado es " + result);
	}
}
