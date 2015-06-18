package collection.stream;

import java.util.List;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class FilteringMalesToListUsingStreamCollect {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		List<String> males = persons.stream().filter(person -> person.getGender() == Person.Sex.MALE)
		.map(Person::getName).collect(Collectors.toList());
		System.out.println("Males: "+males);
	}
}
