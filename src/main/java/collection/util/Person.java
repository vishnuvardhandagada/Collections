package collection.util;

import java.util.Date;

public class Person {

	public enum Sex{
		MALE, FEMALE;
	}
	private String name;
	private Sex gender;
	private Date birthday;
	private String emailAddress;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, Sex gender, Date birthday, String emailAddress){
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.emailAddress = emailAddress;
	}
	
	public Person(String name, Sex gender, Date birthday, String emailAddress, int age){
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.emailAddress = emailAddress;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name: "+this.name+", gender: "+this.gender+", birthday: "+this.birthday+", email: "+this.emailAddress+"]";
	}
}
