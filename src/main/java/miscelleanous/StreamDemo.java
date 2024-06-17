package miscelleanous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList();
		names.add("Abhi");
		names.add("Sreevedh");
		names.add("Sasi");
		names.add("Lalu");
		// there is no life for intermediate operation without terminal operation
		// terminal operation only execute if inter operation return true
		// can create stream using stream: Stream.of("Gopi");

		Long namesWithS = names.stream().filter(s -> s.contains("S")).count();
		System.out.println("Count of names with S: " + namesWithS);
		names.stream().filter(s -> s.contains("S")).forEach(s -> System.out.println(s));// printing the name start with
																						// "s"

		System.out.println("////// PRINTING WITH LIMIT");
		names.stream().filter(s -> s.contains("S")).limit(1).forEach(s -> System.out.println(s));

		// print names which starts with S as uppercase
		names.stream().filter(s -> s.contains("S")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println();
		/* Concatenation */
		// concatenate two lists
		List<String> lis1 = Arrays.asList("Gopi", "Sreevedh", "Appu"); // here converting an array to list and storing
																		// it in to a list
		List<String> lis2 = Arrays.asList("Harikrishnan", "Haritha");
		Stream<String> concatStream = Stream.concat(lis1.stream(), lis2.stream()); // concatenating list using stream
		// concatStream.sorted().forEach(s->System.out.println(s)); // sorting and
		// printing the stream
		Boolean flag = concatStream.anyMatch(s -> s.equalsIgnoreCase("sreevedh"));
		System.out.println(flag);
		
		
		//converting output of STREAM in to list - we genearlly don't print output
		
		List<String>collectionToList=Stream.of("AB","CD","EF").collect(Collectors.toList());

	}

}
