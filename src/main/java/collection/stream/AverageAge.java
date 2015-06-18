package collection.stream;

import java.util.List;

import collection.util.CollectionUtil;
import collection.util.Person;

public class AverageAge {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		System.out.println(persons.stream()
				.filter(person -> person.getGender() == Person.Sex.MALE)
				.mapToInt(Person::getAge)
				.average().getAsDouble());
	}
}
