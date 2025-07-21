package Level_1.sprint1Tasca1_6_Nivell1_ex2;

public class Person {
	
	private String name;
	private String surname;
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