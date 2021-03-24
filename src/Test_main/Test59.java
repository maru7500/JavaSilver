package Test_main;


class A{
	void A(){System.out.println("A");}
}
class B extends A{
	void A(){System.out.println("B");}
}
class C extends B{
	void A(){System.out.println("C");}
}

public class Test59 {

	public static void main(String[] args) {
		C obj = new C();
		obj.A();
	}

}
