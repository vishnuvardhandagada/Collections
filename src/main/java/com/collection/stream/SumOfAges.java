package com.collection.stream;

import java.util.List;

public class SumOfAges {

	public static void main(String[] args) {
		SumOfAges sumOfAges = new SumOfAges();
		sumOfAges.ageSum();
	}
	
	public void ageSum(){
		List<Person> persons = CollectionUtil.getPersonList();
		System.out.println(persons.stream().mapToInt(person -> person.getAge()).sum());
	}
	
	public void usingStreamReduceForSum(){
		List<Person> persons = CollectionUtil.getPersonList();
		persons.stream().map(person -> person.getAge()).reduce(0, (a,b) -> a+b);
	}
}
