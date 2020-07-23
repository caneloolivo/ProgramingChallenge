import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsSolution {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List> groups = new HashMap<String, List>();
		for(String str: strs) {
			char[] strArray = str.toCharArray();
			Arrays.parallelSort(strArray);
			String key = String.valueOf(strArray);
			if(!groups.containsKey(key))
				groups.put(key, new ArrayList());
			groups.get(key).add(str);
		}
		return new ArrayList(groups.values());        
    }
	public static void main(String[] args) {
		GroupAnagramsSolution solution = new GroupAnagramsSolution();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = solution.groupAnagrams(strs);
		System.out.print("El resultado es " + String.valueOf(result));
	}
}
