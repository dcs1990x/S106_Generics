package Level_1.Exercise_2.model;

public class GenericMethods {
	
	public static <T, U, V> void printAttributes(T param1, U param2, V param3) {
		System.out.println(param1 + ", " + param2 + param3 + "\n");
	}
}