package collection.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class TotalAgeBasedOnGender {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		Map<Person.Sex, Integer> totalAgeOfEachGender = persons.stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.reducing(0, Person::getAge, Integer::sum)));
		System.out.println(totalAgeOfEachGender);
	}
}
