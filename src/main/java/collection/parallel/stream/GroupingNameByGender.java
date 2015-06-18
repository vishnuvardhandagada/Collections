package collection.parallel.stream;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import collection.util.CollectionUtil;
import collection.util.Person;

public class GroupingNameByGender {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		ConcurrentMap<Person.Sex, List<String>> genderGrouping = persons.parallelStream()
				.collect(Collectors.groupingByConcurrent(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(genderGrouping);
	}
}
