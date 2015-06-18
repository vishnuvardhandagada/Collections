package com.collection.stream;

import java.util.List;

/**
 * class to print all members of collection using stream aggregate operations
 * @author adonthu
 *
 */
public class PrintAllElementsWithStream {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		persons.stream().forEach(person -> {System.out.println(person);});
	}
}
