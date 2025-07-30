package Level_1.Exercise_1;

public class Main {

	public static void main(String[] args) {
		
		NoGenericMethods ngm1 = new NoGenericMethods("Lion", "Elephant", "Giraffe");
        NoGenericMethods ngm2 = new NoGenericMethods("Soup", "Stew", "Salad");

        System.out.println("First list of objects:\n");
        ngm1.printObjects();

        System.out.println("Second list of objects:\n");
        ngm2.printObjects();
	}
}