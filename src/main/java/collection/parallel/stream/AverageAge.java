package collection.parallel.stream;

import java.util.List;

import collection.util.CollectionUtil;
import collection.util.Person;

public class AverageAge {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		double avg = persons.parallelStream()
				.mapToInt(person -> person.getAge()).average().getAsDouble();
		System.out.println("Average age: "+avg);
	}
}
