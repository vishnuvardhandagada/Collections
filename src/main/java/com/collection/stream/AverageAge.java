package com.collection.stream;

import java.util.List;

public class AverageAge {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		System.out.println(persons.stream()
				.filter(person -> person.getGender() == Person.Sex.MALE)
				.mapToInt(Person::getAge)
				.average().getAsDouble());
	}
}
