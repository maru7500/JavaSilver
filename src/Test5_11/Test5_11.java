package Test5_11;

public class Test5_11 {

	public static void main(String[] args) {
		Test5_11 obj1 = new Test5_11();
		Test5_11 obj2 = new Test5_11();
		System.out.println(obj1 == obj2);
		obj2 = operate(obj1, obj2);
		System.out.println(obj1 == obj2);
	}

	static Test5_11 operate(Test5_11 obj1, Test5_11 obj2) {
		Test5_11 obj3 = obj1;
//		obj1 = obj2;
		return obj3;
	}
}
