package Level_1.Exercise_1;

public class NoGenericMethods {
   
	private String obj1;
    private String obj2;
    private String obj3;

    public NoGenericMethods(String obj1, String obj2, String obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public String getObj1() {
        return obj1;
    }

    public String getObj2() {
        return obj2;
    }

    public String getObj3() {
        return obj3;
    }

    public void setObj1(String obj1) {
        this.obj1 = obj1;
    }

    public void setObj2(String obj2) {
        this.obj2 = obj2;
    }

    public void setObj3(String obj3) {
        this.obj3 = obj3;
    }

    public void printObjects() {
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);
        System.out.println("Object 3: " + obj3);
    }
}