package collection.stream;

import java.util.List;
import java.util.function.IntConsumer;

import collection.util.CollectionUtil;
import collection.util.Person;

public class StreamCollectMethod {

	public static void main(String[] args) {
		List<Person> persons = CollectionUtil.getPersonList();
		Averager averageCollector = persons.stream()
				.filter(person -> person.getGender() == Person.Sex.MALE)
				.map(person -> person.getAge())
				.collect(Averager::new, Averager::accept, Averager::combine);
		System.out.println("Average age: "+averageCollector.average());
	}
}

class Averager implements IntConsumer{
	private int total = 0;
	private int count = 0;
	
	public double average(){
		return count > 0 ? ((double)total)/count : 0;
	}
	
	@Override
	public void accept(int value) {
		total = total + value;
		count++;
	}
	
	public void combine(Averager other){
		total = total + other.total;
		count = count + other.count;
	}
}