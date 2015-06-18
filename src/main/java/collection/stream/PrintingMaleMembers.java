package collection.stream;

import java.util.List;

import collection.util.CollectionUtil;
import collection.util.Person;

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
