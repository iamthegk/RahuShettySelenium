package miscelleanous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndCollectors {
	
	/*
	 * 1. Get unique values
	 * 2. Sort it
	 * 3. Store in to list
	 * 4. From the list get second element only
	 * 5. Without for lopp - Interview question
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>values=Arrays.asList(1,5,7,6,9,2,1,3,6,8,4);
		System.out.println("sorted list");
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("second element");
		List<Integer> values2=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values2.get(1));
	}

}
