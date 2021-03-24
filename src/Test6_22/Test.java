package Test6_22;

public class Test {

	public static void main(String[] args) {
		A[] aaa = {new A(),new B()};
		for(A a : aaa) {
			A b = a.get();
			System.out.println(b);
		}
	}
}

class A {
	A get() {
		return new A();
	}
}

class B extends A{
	B get() {
		return new B();
	}
}
