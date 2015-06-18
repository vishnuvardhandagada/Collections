package collection.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CollectionUtil {

	@SuppressWarnings("deprecation")
	public static List<Person> getPersonList(){
		List<Person> persons = new ArrayList<Person>(
				Arrays.asList(new Person("joe", Person.Sex.MALE, new Date(1981, 1, 1), "joe@gmail.com",34),
						new Person("raj", Person.Sex.MALE, new Date(1982, 2, 2), "raj@gmail.com",33),
						new Person("gita", Person.Sex.FEMALE, new Date(1986, 6, 6), "web@gmail.com",29),
						new Person("vanita", Person.Sex.FEMALE, new Date(1987, 7, 7), "web@gmail.com",28),
						new Person("kamal", Person.Sex.MALE, new Date(1983, 3, 3), "kamal@gmail.com",32),
						new Person("webb", Person.Sex.MALE, new Date(1984, 4, 4), "web@gmail.com",31),
						new Person("sita", Person.Sex.FEMALE, new Date(1985, 5, 5), "web@gmail.com",30),
						new Person("lalita", Person.Sex.FEMALE, new Date(1988, 8, 8), "web@gmail.com",27)));
		return persons;
	}
	
	public static List<Integer> getIntegerList(){
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};
		List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
		return numberList;
	}
}
