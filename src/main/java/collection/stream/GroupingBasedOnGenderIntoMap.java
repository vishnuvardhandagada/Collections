package collection.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class GroupingBasedOnGenderIntoMap {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		Map<Person.Sex, List<Person>> groupedByGender = 
				persons.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		System.out.println(groupedByGender);
	}
}
