package collections;

import java.util.HashSet;
import java.util.Set;

public class SetNullTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add("jkj");
		set.add(null);
		System.out.println(set);
	}
}
