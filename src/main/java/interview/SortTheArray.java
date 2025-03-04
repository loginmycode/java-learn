package interview;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//careers2@persistent.com
public class SortTheArray {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(0,1,3,5,0,6,2,0,6,9,0);
		
		List res= list.stream().sorted().collect(Collectors.toList());
		
		List dup = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(res);	
		System.out.println(dup);
	}
}
