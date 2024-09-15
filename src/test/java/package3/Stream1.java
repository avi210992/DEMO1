package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	
	public static <T> void main(String[] args) {
		List<List<String>> LOL = Arrays.asList(
	            Arrays.asList("Reflection", "Collection", "Stream"),
	            Arrays.asList("Structure", "State", "Flow"),
	            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
	        );
		
		//Stream<String> s1 = LOL.stream().flatMap(List::stream);
		//s1.forEach(System.out::println);
		
		//System.out.println(s1.allMatch(s->s instanceof String));;
		//System.out.println(s1.count());
		//System.out.println(s1.filter()).collect(Collectors.toList()));;
		//s1.reduce(String::concat);
	ArrayList<String> al1 = new ArrayList<>();
	
System.out.println(LOL.stream().flatMap(s1 -> s1.stream()).reduce((s1,s2) -> s1.compareTo(s2)>1?s1:s2).get());;



		
	}

}
