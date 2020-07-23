
public class NumJewelsInStonesSolution {
	public int numJewelsInStones(String J, String S) {
		int count =0;
		for(char s : S.toCharArray()) {
			if(isJewelsInStone(J, s))
				count++;
		}
		return count;    
    }
	boolean isJewelsInStone(String J, char s) {
		for(char j: J.toCharArray()) {
			if(j == s)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		NumJewelsInStonesSolution solution = new NumJewelsInStonesSolution();
		int num = solution.numJewelsInStones("z", "ZZ");
		System.out.println(num);
	}

}
