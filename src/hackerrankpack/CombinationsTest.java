package hackerrankpack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Stream.of(0,1,2,3).collect(Collectors.toList());
		List<List<Integer>> combinations = getCombinations(nums);
		System.out.println(combinations);
		System.out.println(combinations.size());
		/*List<Integer> flatMapList = combinations.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(flatMapList);*/
	}

	private static List<List<Integer>> getCombinations(List<Integer> nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		for(int i=1;i<Math.pow(2, nums.size());i++) {
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<nums.size();j++) {
				if((i & (long)Math.pow(2, j))>0) {
					list.add(nums.get(j));
				}
			}
			combinations.add(list);
		}
		return combinations;
	}

}
