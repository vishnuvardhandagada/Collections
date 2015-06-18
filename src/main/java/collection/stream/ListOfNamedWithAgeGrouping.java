package collection.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class ListOfNamedWithAgeGrouping {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		Map<Person.Sex, List<String>> groupingByGender = persons.stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(groupingByGender);
	}
}
