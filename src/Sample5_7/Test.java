package Sample5_7;

class Maru{
	int maru = 100;
	static int yama = 200;
	void methodA() {
		System.out.println("hey" + maru);
	}
	static void methodB() {
		System.out.println("hello" +  yama);
	}
}


public class Test {
	public static void main(String[] args) {
//		System.out.println(Maru.maru);
		System.out.println(Maru.yama);
//		Maru.methodA();
		Maru.methodB();
		System.out.println("---------");
		Maru takeshi = new Maru();
		System.out.println(takeshi.maru);
		System.out.println(takeshi.yama);
		takeshi.methodA();
		takeshi.methodB();
	}

}
