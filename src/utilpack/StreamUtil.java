package utilpack;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  list = Stream.of(2,1,3,4,4).collect(Collectors.toList());
		
		System.out.println("max: "+ list.stream().max(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("min: "+ list.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("sorted: "+ list.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList()));
		System.out.println("sum: "+ list.stream().mapToInt(x->x).sum());
		System.out.println("average: "+ list.stream().mapToInt(x->x).average().getAsDouble());
		System.out.println("distinct: "+list.stream().distinct().collect(Collectors.toList()));
		System.out.println("anymatch: "+list.stream().anyMatch(x->x==5));
		System.out.println("allmatch: "+list.stream().allMatch(x->x>=1));
		System.out.println("count: "+list.stream().count());
		
		IntSummaryStatistics statistics = list.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("count using statistics: "+statistics.getCount());
	}

}
