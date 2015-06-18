package collection.parallel.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collection.util.CollectionUtil;


public class OrderingCollection {

	public static void main(String[] args) {
		List<Integer> numbers = CollectionUtil.getIntegerList();
		
		System.out.println("numbers in same order:");
		numbers.stream().forEach(number -> {System.out.print(number);});
		System.out.println();
		
		System.out.println("number in reverse order: ");
		Comparator<Integer> ascending = Integer::compare;
		Comparator<Integer> reverse = ascending.reversed();
		Collections.sort(numbers, reverse);
		numbers.stream().forEach(number -> {System.out.print(number);});
		System.out.println();
		
		System.out.println("numbers using parallel stream: ");
		numbers.parallelStream().forEach(number -> {System.out.print(number);});
		System.out.println();
		
		System.out.println("numbers using another parallel stream: ");
		numbers.parallelStream().forEach(number -> {System.out.print(number);});
		System.out.println();
		
		System.out.println("with forEachOrdered: ");
		numbers.parallelStream().forEachOrdered(number -> {System.out.print(number);});
 	}
}
