package Level_1.Exercise_2;

import Level_1.Exercise_2.model.GenericMethods;
import Level_1.Exercise_2.model.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("Dani", "Caldito", 35);
		
		GenericMethods.printAttributes(person1, "nice to meet you", '.');
	}
}