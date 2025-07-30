package Level_1.Exercise_2.model;

public class Person {
	
	private String name, surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurame() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
    public String toString() {
        return "My name is " + name + " " + surname + " and I'm " + age + " years old";
	}
}