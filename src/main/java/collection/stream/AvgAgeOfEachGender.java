package collection.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class AvgAgeOfEachGender {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		Map<Person.Sex, Double> avgAgeGenderWise = persons.stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.averagingInt(Person::getAge)));
		System.out.println(avgAgeGenderWise);
	}
}
