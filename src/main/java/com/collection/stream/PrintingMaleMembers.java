package com.collection.stream;

import java.util.List;

/**
 * Filtering and printing only female members
 * @author adonthu
 *
 */
public class PrintingMaleMembers {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		persons.stream()
		.filter(person -> person.getGender() == Person.Sex.FEMALE)
		.forEach(person -> {System.out.println(person);});
	}
}
